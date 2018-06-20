package com.gapblue.salesdashboard;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.ws.BindingProvider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.gapblue.web.stubs.opportunity.ChildFindCriteria;
import com.gapblue.web.stubs.opportunity.Conjunction;
import com.gapblue.web.stubs.opportunity.FindControl;
import com.gapblue.web.stubs.opportunity.FindCriteria;
import com.gapblue.web.stubs.opportunity.FindOpportunity;
import com.gapblue.web.stubs.opportunity.ObjectFactory;
import com.gapblue.web.stubs.opportunity.Opportunity;
import com.gapblue.web.stubs.opportunity.OpportunityService;
import com.gapblue.web.stubs.opportunity.OpportunityService_Service;
import com.gapblue.web.stubs.opportunity.ServiceException;
import com.gapblue.web.stubs.opportunity.SortOrder;
import com.gapblue.web.stubs.opportunity.ViewCriteria;
import com.gapblue.web.stubs.opportunity.ViewCriteriaItem;
import com.gapblue.web.stubs.opportunity.ViewCriteriaRow;

@Service
public class OpportunityWsClient {

	Logger log = LoggerFactory.getLogger(OpportunityWsClient.class);

	protected static OpportunityService_Service opportunityService_Service;
	protected OpportunityService opportunityService;
	protected ObjectFactory objectFactory = new ObjectFactory();

	public OpportunityWsClient(String url, String user, String password) {

		init(url, user, password);
	}

	public OpportunityWsClient() {

	}

	protected void init(String url, String user, String password) {
		try {

			URL wsdlLocation = new URL(url);
			opportunityService_Service = new OpportunityService_Service(wsdlLocation);
			opportunityService = opportunityService_Service.getOpportunityServiceSoapHttpPort();

			Map<String, Object> reqContext = ((BindingProvider) opportunityService).getRequestContext();
			reqContext.put(BindingProvider.USERNAME_PROPERTY, user);
			reqContext.put(BindingProvider.PASSWORD_PROPERTY, password);
		} catch (Exception e) {
			log.info("Failed to load properties of URL");
			e.printStackTrace();
		}

		objectFactory = new ObjectFactory();
	}

	public List<Opportunity> findOpportunity() throws Exception {
		OpportunityWsClient oppClient = new OpportunityWsClient();
		ViewCriteria filter = new ViewCriteria();
		List<Opportunity> opportunities = null;
		int i = 1;

		opportunities = oppClient.findOpportunityInOsc(0, 100, filter, null, false, null, null);
		if (opportunities != null && !opportunities.isEmpty()) {
			for (Opportunity opportunity : opportunities) {
				log.debug(i++ + " Finding Opportunity account number " + opportunity.getOptyId().longValue());

			}
		} else {
			log.debug("No opportunities found.");
		}

		return opportunities;
	}

	public ViewCriteriaItem getOpportunityViewCriteriaItem(Conjunction conjunction, String atrribute, String operator,
			String value, ViewCriteria nested) {
		log.info("getOpportunityViewCriteriaItem >>");
		ViewCriteriaItem item = new ViewCriteriaItem();
		item.setConjunction(conjunction);
		item.setAttribute(atrribute);
		item.setOperator(operator);
		if (!"EXISTS".equals(operator)) {
			item.getValue().add(value);
		}
		// create Nested ViewCriteria
		if (nested != null)
			item.setNested(nested);
		log.info("getOpportunityViewCriteriaItem <<");
		return item;
	}

	public List<Opportunity> findOpportunityWithLastUpdatedTime(String lastUpdateTime) throws Exception {

		log.info("Last updated time : " + lastUpdateTime);
		ViewCriteria filter = new ViewCriteria();
		ViewCriteriaRow group = new ViewCriteriaRow();
		group.setConjunction(Conjunction.AND);
		group.getItem()
				.add(getOpportunityViewCriteriaItem(Conjunction.AND, "LastUpdateDate", "AFTER", lastUpdateTime, null));

		List<Opportunity> opportunities = new ArrayList<Opportunity>();
		Set<Opportunity> oppSet = new HashSet<Opportunity>();
		filter.getGroup().add(group);
		int fetchStart = 0;
		int fetchSize = 500;
		int count = 0;
		int totalcount = 0;
		do {
			count = 0;

			try {
				opportunities.clear();
				opportunities = findOpportunityInOsc(fetchStart, fetchSize, filter, null, false, null, null);
			} catch (ServiceException se) {
				log.error("Error occurred while invoking SalesCloud at fetchStart " + fetchStart);
				se.printStackTrace();
			} catch (Exception e) {
				log.error("Error occurred while invoking SalesCloud at fetchStart " + fetchStart);
				e.printStackTrace();
			}
			oppSet.addAll(opportunities);
			log.info("After execution of " + fetchStart + ":: to " + fetchSize);
			fetchStart = fetchStart + fetchSize;
			count = opportunities.size();
			totalcount = count + totalcount;

		} while (opportunities.size() == 500);

		opportunities.addAll(oppSet);
		log.info("Total count of opportunities : " + totalcount + ":::" + opportunities.size());
		return opportunities;
	}

	public List<Opportunity> findOpportunityInOsc(int fetchStart, int fetchSize, ViewCriteria filter,
			List<String> findAttributes, boolean excludeAttribute, List<ChildFindCriteria> childFindCriteriaList,
			SortOrder sortOrder) throws Exception {
		log.info("findOpportunity >>" + fetchStart + ":: " + fetchSize);

		FindCriteria findCriteria = objectFactory.createFindCriteria();

		findCriteria.setFetchStart(fetchStart);
		findCriteria.setFetchSize(fetchSize);
		if (findAttributes != null && !findAttributes.isEmpty()) {
			findCriteria.getFindAttribute().addAll(findAttributes);
		}
		findCriteria.setExcludeAttribute(excludeAttribute);

		// Filter
		if (filter != null) {
			findCriteria.setFilter(filter);
		}

		// SortOrder
		if (sortOrder != null) {
			findCriteria.setSortOrder(sortOrder);
		}

		FindControl findControl = objectFactory.createFindControl();
		findControl.setRetrieveAllTranslations(true);

		FindOpportunity findOpportunity = objectFactory.createFindOpportunity();
		findOpportunity.setFindControl(findControl);
		findOpportunity.setFindCriteria(findCriteria);

		List<Opportunity> opportunities = null;
		try {
			log.info("Filter :: " + findCriteria.getFilter().getGroup().get(0).getItem().get(0).getAttribute());

			opportunities = opportunityService.findOpportunity(findCriteria, findControl);

		} catch (Exception e) {
			throw e;
		}

		if (opportunities != null) {
			log.debug("findOpportunity successful, found " + opportunities.size() + " opportunities");

		}

		log.debug("findOpportunity <<");
		return opportunities;
	}

	
}
