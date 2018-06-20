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

import com.gapblue.web.stubs.accountresource.ChildFindCriteria;
import com.gapblue.web.stubs.accountresource.Conjunction;
import com.gapblue.web.stubs.accountresource.FindControl;
import com.gapblue.web.stubs.accountresource.FindCriteria;
import com.gapblue.web.stubs.accountresource.FindSalesAccountResource;
import com.gapblue.web.stubs.accountresource.ObjectFactory;
import com.gapblue.web.stubs.accountresource.SalesAccountResource;
import com.gapblue.web.stubs.accountresource.SalesAccountResourceService;
import com.gapblue.web.stubs.accountresource.SalesAccountResourceService_Service;
import com.gapblue.web.stubs.accountresource.ServiceException;
import com.gapblue.web.stubs.accountresource.SortOrder;
import com.gapblue.web.stubs.accountresource.ViewCriteria;
import com.gapblue.web.stubs.accountresource.ViewCriteriaItem;
import com.gapblue.web.stubs.accountresource.ViewCriteriaRow;

@Service
public class AccountResourceOscWsClient {

	Logger log = LoggerFactory.getLogger(AccountResourceOscWsClient.class);

	protected static SalesAccountResourceService_Service salesAccountResourceService_Service;
	protected SalesAccountResourceService salesAccountService;
	protected ObjectFactory objectFactory;

	public AccountResourceOscWsClient() {
		// init();
	}

	public AccountResourceOscWsClient(String url, String user, String password) {
		log.debug("Called AccountResourceOscWsClient with args ");
		init(url, user, password);
	}

	protected void init(String url, String user, String password) {
		try {

			URL wsdlLocation = new URL(url);
			salesAccountResourceService_Service = new SalesAccountResourceService_Service(wsdlLocation);
			salesAccountService = salesAccountResourceService_Service.getSalesAccountResourceServiceSoapHttpPort();

			Map<String, Object> reqContext = ((BindingProvider) salesAccountService).getRequestContext();
			reqContext.put(BindingProvider.USERNAME_PROPERTY, user);
			reqContext.put(BindingProvider.PASSWORD_PROPERTY, password);

			objectFactory = new ObjectFactory();
		} catch (Exception e) {
			log.info("Failed to load properties of URL");
			e.printStackTrace();
		}
	}

	public List<SalesAccountResource> findAccResourceWithLastUpdatedTime(String lastUpdateTime) throws Exception {

		log.info("Last updated time : " + lastUpdateTime);
		ViewCriteria filter = new ViewCriteria();
		ViewCriteriaRow group = new ViewCriteriaRow();
		group.setConjunction(Conjunction.AND);
		group.getItem()
				.add(getResourceViewCriteriaItem(Conjunction.AND, "LastUpdateDate", "AFTER", lastUpdateTime, null));

		List<SalesAccountResource> salesAccountResources = new ArrayList<SalesAccountResource>();
		Set<SalesAccountResource> salesAccResourceSet = new HashSet<SalesAccountResource>();
		filter.getGroup().add(group);
		int fetchStart = 0;
		int fetchSize = 500;
		int count = 0;
		int totalcount = 0;
		do {
			count = 0;

			try {
				salesAccountResources.clear();
				salesAccountResources = findResourceInOsc(fetchStart, fetchSize, filter, null, false, null, null);
			} catch (ServiceException se) {
				log.error("Error occurred while invoking SalesCloud at fetchStart " + fetchStart);
				se.printStackTrace();
			} catch (Exception e) {
				log.error("Error occurred while invoking SalesCloud at fetchStart " + fetchStart);
				e.printStackTrace();
			}
			salesAccResourceSet.addAll(salesAccountResources);
			log.debug("After execution of " + fetchStart + ":: to " + fetchSize);
			fetchStart = fetchStart + fetchSize;
			count = salesAccountResources.size();
			totalcount = count + totalcount;

		} while (salesAccountResources.size() == 500);

		salesAccountResources.addAll(salesAccResourceSet);
		log.info("Total count of opportunities : " + totalcount + ":::" + salesAccountResources.size());
		return salesAccountResources;
	}

	public ViewCriteriaItem getResourceViewCriteriaItem(Conjunction conjunction, String atrribute, String operator,
			String value, ViewCriteria nested) {
		log.info("getResourceViewCriteriaItem >>");
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
		log.info("getResourceViewCriteriaItem <<");
		return item;
	}

	public List<SalesAccountResource> findResourceInOsc(int fetchStart, int fetchSize, ViewCriteria filter,
			List<String> findAttributes, boolean excludeAttribute, List<ChildFindCriteria> childFindCriteriaList,
			SortOrder sortOrder) throws Exception {
		log.info("findResourceInOsc >>" + fetchStart + ":: " + fetchSize);

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

		FindSalesAccountResource findSalesAccountResource = objectFactory.createFindSalesAccountResource();
		findSalesAccountResource.setFindControl(findControl);
		findSalesAccountResource.setFindCriteria(findCriteria);

		List<SalesAccountResource> salesAccountResources = null;
		try {
			log.info("Filter :: " + findCriteria.getFilter().getGroup().get(0).getItem().get(0).getAttribute());
			// findAccountResponse =
			// opportunityService.findOpportunity(findCriteria, findControl);
			salesAccountResources = salesAccountService.findSalesAccountResource(findCriteria, findControl);

		} catch (Exception e) {
			throw e;
		}

		if (salesAccountResources != null) {
			log.debug("find salesAccountResources successful, found " + salesAccountResources.size()
					+ " salesAccountResources");
			// opportunities = findOpportunityResponse.getValue();
		}

		log.debug("findResourceInOsc <<");
		return salesAccountResources;
	}

	/*
	 * public static void main(String[] args) { System.out.println("In main");
	 * AccountResourceOscWsClient accountResourceOscWsClient = new
	 * AccountResourceOscWsClient(
	 * "https://eeal.crm.us2.oraclecloud.com:443/crmCommonSalesParties/SalesAccountResourceService"
	 * ,"iuser","Welcome123"); // CustomObjectOscWsClient customClient = new
	 * CustomObjectOscWsClient(
	 * "https://eeal.crm.us2.oraclecloud.com:443/opptyMgmtExtensibility/SalesCustomObjectService",
	 * "iuser", "Welcome123"); try { List<SalesAccountResource> accResourceList
	 * = accountResourceOscWsClient.findAccResourceWithLastUpdatedTime(
	 * "2014-01-01T01:00:00.000Z"); // List<Object> forecastObjectList=
	 * customClient.findForecastHistoryWithLastUpdatedTime(
	 * "2014-01-01T01:00:00.000Z");
	 * 
	 * for(int i=0;i<accResourceList.size();i++) {
	 * System.out.println(accResourceList.get(i).getPartyName()); }
	 * System.out.println("Total no "+accResourceList.size()); // List<Object>
	 * forecastObjectList= customClient.findForecastHistoryWithYear(); }
	 * catch(Exception e) { e.printStackTrace(); } }
	 */
}
