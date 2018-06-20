package com.gapblue.salesdashboard;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.ws.BindingProvider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.repository.query.parser.Part.IgnoreCaseType;
import org.springframework.stereotype.Service;

import com.gapblue.web.stubs.opportunity.ChildFindCriteria;
import com.gapblue.web.stubs.opportunity.SortOrder;
import com.gapblue.web.stubs.salescustomobject.Conjunction;
import com.gapblue.web.stubs.salescustomobject.FindControl;
import com.gapblue.web.stubs.salescustomobject.FindCriteria;
import com.gapblue.web.stubs.salescustomobject.FindEntity;
import com.gapblue.web.stubs.salescustomobject.ForecastHistoryC;
import com.gapblue.web.stubs.salescustomobject.ObjectFactory;
import com.gapblue.web.stubs.salescustomobject.QuoteLineItemTeamC;
import com.gapblue.web.stubs.salescustomobject.SalesCustomObjectService;
import com.gapblue.web.stubs.salescustomobject.SalesCustomObjectService_Service;
import com.gapblue.web.stubs.salescustomobject.SampleRequestTeamC;
import com.gapblue.web.stubs.salescustomobject.ServiceException;
import com.gapblue.web.stubs.salescustomobject.ViewCriteria;
import com.gapblue.web.stubs.salescustomobject.ViewCriteriaItem;
import com.gapblue.web.stubs.salescustomobject.ViewCriteriaRow;


@Service
public class CustomObjectOscWsClient {
Logger log = LoggerFactory.getLogger(CustomObjectOscWsClient.class);
	
    protected static SalesCustomObjectService_Service customObjectService_Service;
    protected SalesCustomObjectService customObjectService;
    protected ObjectFactory objectFactory = new ObjectFactory();
	
    
	public CustomObjectOscWsClient(String url,String user, String password) {
		log.debug("Called CustomObjectOscWsClient with args ");
		init(url,user,password);
    }

	public CustomObjectOscWsClient() {
		log.debug("Called CustomObjectOscWsClient without args ");
	
	}
	
    protected void init(String url,String user, String password) {	    
    	try {
			URL wsdlLocation=new URL(url);
			  customObjectService_Service = new SalesCustomObjectService_Service(wsdlLocation);
		} catch (MalformedURLException e) {
		log.debug("Exception in init");
			e.printStackTrace();
		}
	  
	    customObjectService = customObjectService_Service.getSalesCustomObjectServiceSoapHttpPort();
	    
	    Map<String, Object> reqContext =
	    ((BindingProvider)customObjectService).getRequestContext();
	    reqContext.put(BindingProvider.USERNAME_PROPERTY, user);
	    reqContext.put(BindingProvider.PASSWORD_PROPERTY, password);
	
	    objectFactory = new ObjectFactory();
    }
    
    public List<Object> findForecastHistoryWithLastUpdatedTime(String lastUpdateTime, String interfaceIdentifier) throws Exception {

	log.debug(" In findForecastHistoryWithLastUpdatedTime Last updated time : "+lastUpdateTime);
	log.debug(" In findForecastHistoryWithLastUpdatedTime Interface Identifier : "+interfaceIdentifier);
	
		ViewCriteria filter = new ViewCriteria();
		ViewCriteriaRow group = new ViewCriteriaRow();
		
		if (interfaceIdentifier.equalsIgnoreCase("Published"))
		{	
			log.debug("Inside Published");
			group.setConjunction(Conjunction.AND);
			group.getItem().add(getForeCastHistoryViewCriteriaItem(Conjunction.AND, "LastUpdateDate", "AFTER",
					lastUpdateTime, null));
			group.getItem().add(getForeCastHistoryViewCriteriaItem(Conjunction.AND, "ForecastRecordType_c", "=",
					"Published", null));
		}else if (interfaceIdentifier.equalsIgnoreCase("Bottoms Up"))
		{	
			log.debug("Inside Bottoms Up");
			group.setConjunction(Conjunction.AND);
			group.getItem().add(getForeCastHistoryViewCriteriaItem(Conjunction.AND, "LastUpdateDate", "AFTER",
					lastUpdateTime, null));
			group.getItem().add(getForeCastHistoryViewCriteriaItem(Conjunction.AND, "ForecastRecordType_c", "=",
					"Bottoms Up", null));
		}else if (interfaceIdentifier.equalsIgnoreCase("Published,Bottoms Up"))
		{	
			log.debug("Inside Published,Bottoms Up");
			group.setConjunction(Conjunction.AND);
			group.getItem().add(getForeCastHistoryViewCriteriaItem(Conjunction.AND, "LastUpdateDate", "AFTER",
					lastUpdateTime, null));
			group.getItem().add(getForeCastHistoryViewCriteriaItem(Conjunction.AND, "ForecastRecordType_c", "=",
					"Published", null)); 
			group.getItem().add(getForeCastHistoryViewCriteriaItem(Conjunction.OR, "ForecastRecordType_c", "=",
					"Bottoms Up", null));
		}else
		{
			log.debug("Inside Last Else");
			group.setConjunction(Conjunction.AND);
			group.getItem().add(getForeCastHistoryViewCriteriaItem(Conjunction.AND, "LastUpdateDate", "AFTER",
					lastUpdateTime, null));
			group.getItem().add(getForeCastHistoryViewCriteriaItem(Conjunction.AND, "ForecastRecordType_c", "=",
					"Published", null)); 
			group.getItem().add(getForeCastHistoryViewCriteriaItem(Conjunction.OR, "ForecastRecordType_c", "=",
					"Bottoms Up", null));
		}

		List<Object> forecastHistory= new ArrayList<Object>();
		Set<Object> forecastSet = new HashSet<Object>();
		filter.getGroup().add(group);
		int fetchStart = 0;
		int fetchSize = 500;
		int count = 0;
		int totalcount = 0;
		do {
			count = 0;
			
			try {
				forecastHistory.clear();
				forecastHistory=findForecastHistoryInOsc(fetchStart, fetchSize, filter, null, false, null, null);
			}  catch (Exception e) {
				log.debug("Error occurred while invoking SalesCloud at fetchStart " + fetchStart);
				e.printStackTrace();
			}
			forecastSet.addAll(forecastHistory);
			log.debug("After execution of "+fetchStart +":: to "+fetchSize);
			fetchStart = fetchStart + fetchSize;
			count = forecastHistory.size();
			totalcount = count + totalcount;
			
			/*if (totalcount == 50000)
			{
				log.debug("Aswathy : Break Statement");
				break;
			} */
			
		} while (forecastHistory.size() == 500);

		forecastHistory.addAll(forecastSet);
		log.debug("Total count of forecasthistory : " + totalcount + ":::" + forecastHistory.size());
		return forecastHistory;
	}
    
    public List<Object> findForecastWithLastUpdatedTime(String lastUpdateTime) throws Exception {

	log.debug(" In findForecastWithLastUpdatedTime Last updated time : "+lastUpdateTime);
		ViewCriteria filter = new ViewCriteria();
		ViewCriteriaRow group = new ViewCriteriaRow();
		group.setConjunction(Conjunction.AND);
		group.getItem().add(getForeCastHistoryViewCriteriaItem(Conjunction.AND, "LastUpdateDate", "AFTER",
				lastUpdateTime, null));

		List<Object> forecastHistory= new ArrayList<Object>();
		Set<Object> forecastSet = new HashSet<Object>();
		filter.getGroup().add(group);
		int fetchStart = 0;
		int fetchSize = 500;
		int count = 0;
		int totalcount = 0;
		do {
			count = 0;
			
			try {
				forecastHistory.clear();
				forecastHistory=findForecastInOsc(fetchStart, fetchSize, filter, null, false, null, null);
			}  catch (Exception e) {
				log.debug("Error occurred while invoking SalesCloud at fetchStart " + fetchStart);
				e.printStackTrace();
			}
			forecastSet.addAll(forecastHistory);
			log.debug("After execution of "+fetchStart +":: to "+fetchSize);
			fetchStart = fetchStart + fetchSize;
			count = forecastHistory.size();
			totalcount = count + totalcount;

		} while (forecastHistory.size() == 500);

		forecastHistory.addAll(forecastSet);
		log.debug("Total count of forecasthistory : " + totalcount + ":::" + forecastHistory.size());
		return forecastHistory;
	}
    public List<Object> findQuoteLineWithLastUpdatedTime(String lastUpdateTime) throws Exception {
	log.debug(" In findQuoteLineWithLastUpdatedTime Last updated time : "+lastUpdateTime);
		ViewCriteria filter = new ViewCriteria();
		ViewCriteriaRow group = new ViewCriteriaRow();
		group.setConjunction(Conjunction.AND);
		group.getItem().add(getQuotelineViewCriteriaItem(Conjunction.AND, "LastUpdateDate", "AFTER",
				lastUpdateTime, null));

		List<Object> quoteLineItem= new ArrayList<Object>();
		Set<Object> quoteLineSet = new HashSet<Object>();
		filter.getGroup().add(group);
		int fetchStart = 0;
		int fetchSize = 500;
		int count = 0;
		int totalcount = 0;
		do {
			count = 0;
			
			try {
				quoteLineItem.clear();
				quoteLineItem=findQuoteLineInOsc(fetchStart, fetchSize, filter, null, false, null, null);
			}  catch (Exception e) {
				log.debug("Error occurred while invoking SalesCloud at fetchStart " + fetchStart);
				e.printStackTrace();
			}
			quoteLineSet.addAll(quoteLineItem);
			log.debug("After execution of "+fetchStart +":: to "+fetchSize);
			fetchStart = fetchStart + fetchSize;
			count = quoteLineItem.size();
			totalcount = count + totalcount;

		} while (quoteLineItem.size() == 500);

		quoteLineItem.addAll(quoteLineSet);
		log.debug("Total count of quoteLineItem : " + totalcount + ":::" + quoteLineItem.size());
		return quoteLineItem;
	}
	public List<Object> findForecastHistoryInOsc(int fetchStart, int fetchSize, ViewCriteria filter,
			List<String> findAttributes, boolean excludeAttribute, List<ChildFindCriteria> childFindCriteriaList,
			SortOrder sortOrder) throws Exception {
		log.info("findForecastHistoryInOsc >>"+fetchStart+":: "+fetchSize);

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

	
		FindControl findControl = objectFactory.createFindControl();
		findControl.setRetrieveAllTranslations(true);

		FindEntity findEntity = objectFactory.createFindEntity();
		findEntity.setFindControl(findControl);
findEntity.setFindCriteria(findCriteria);
	

		List<Object> foreCastHistoryList = null;
		try {
			log.info("Filter :: "+findCriteria.getFilter().getGroup().get(0).getItem().get(0).getAttribute());
			log.info("Filter :: "+findCriteria.getFilter().getGroup().get(0).getItem().get(1).getAttribute());
		foreCastHistoryList = customObjectService.findEntity(findCriteria, findControl,"ForecastHistory_c");
			} catch (Exception e) {
			throw e;
		}

		if (foreCastHistoryList != null) {
			log.debug("findForecastHistory successful, found " + foreCastHistoryList.size() + " forecasthistory");
		}

		log.debug("findForecastHistoryInOsc <<");
		return foreCastHistoryList;
	}
    
	public List<Object> findForecastInOsc(int fetchStart, int fetchSize, ViewCriteria filter,
			List<String> findAttributes, boolean excludeAttribute, List<ChildFindCriteria> childFindCriteriaList,
			SortOrder sortOrder) throws Exception {
		log.info("findForecastInOsc >>"+fetchStart+":: "+fetchSize);

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

		FindControl findControl = objectFactory.createFindControl();
		findControl.setRetrieveAllTranslations(true);

		FindEntity findEntity = objectFactory.createFindEntity();
		findEntity.setFindControl(findControl);
findEntity.setFindCriteria(findCriteria);
	

		List<Object> foreCastHistoryList = null;
		try {
			log.info("Filter :: "+findCriteria.getFilter().getGroup().get(0).getItem().get(0).getAttribute());
		foreCastHistoryList = customObjectService.findEntity(findCriteria, findControl,"Forecast_Custom_c");

		} catch (Exception e) {
			throw e;
		}

		if (foreCastHistoryList != null) {
			log.debug("findForecastCustom successful, found " + foreCastHistoryList.size() + " forecastCustom");
		}

		log.debug("findForecastHistoryInOsc <<");
		return foreCastHistoryList;
	}
    
   
    
	public ViewCriteriaItem getForeCastHistoryViewCriteriaItem(Conjunction conjunction, String atrribute, String operator,
			String value, ViewCriteria nested) {
		log.debug("getForeCastHistoryViewCriteriaItem >>");
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
		log.debug("getForeCastHistoryViewCriteriaItem <<");
		return item;
	}
	public ViewCriteriaItem getQuotelineViewCriteriaItem(Conjunction conjunction, String atrribute, String operator,
			String value, ViewCriteria nested) {
		log.debug("getQuotelineViewCriteriaItem >>");
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
		log.debug("getQuotelineViewCriteriaItem <<");
		return item;
	}
	public List<Object> findQuoteLineInOsc(int fetchStart, int fetchSize, ViewCriteria filter,
			List<String> findAttributes, boolean excludeAttribute, List<ChildFindCriteria> childFindCriteriaList,
			SortOrder sortOrder) throws Exception {
		log.debug("findQuoteLineInOsc >>"+fetchStart+":: "+fetchSize);

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

		FindControl findControl = objectFactory.createFindControl();
		findControl.setRetrieveAllTranslations(true);

		FindEntity findEntity = objectFactory.createFindEntity();
		findEntity.setFindControl(findControl);
findEntity.setFindCriteria(findCriteria);
	

		List<Object> quoteLineList = null;
		try {
			log.info("Filter :: "+findCriteria.getFilter().getGroup().get(0).getItem().get(0).getAttribute());
			quoteLineList = customObjectService.findEntity(findCriteria, findControl,"QuoteLineItem_c");

		} catch (Exception e) {
			throw e;
		}

		if (quoteLineList != null) {
			log.debug("findQuoteLineInOsc successful, found " + quoteLineList.size() + " quotelineitem");
			}

		log.debug("findForecastHistoryInOsc <<");
		return quoteLineList;
	}
    public List<Object> findSalesCustomObjectInOscByFieldname(String objectName, String fieldName, String fieldValue){
    	log.debug("findSalesCustomObjectInOsc >>");
		
		FindCriteria findCriteria = objectFactory.createFindCriteria();
		
		int fetchStart = 0;
		int fetchSize = 500;
		
		ViewCriteria filter = new ViewCriteria();	
		ViewCriteriaRow group =  new ViewCriteriaRow();
		
		group.setConjunction(Conjunction.AND);
		group.setUpperCaseCompare(false);
		
		ViewCriteriaItem item = new ViewCriteriaItem();
		item.setConjunction(Conjunction.AND);
		item.setUpperCaseCompare(false);
		item.setAttribute(fieldName);
		item.setOperator("AFTER");
		item.getValue().add(fieldValue);
		group.getItem().add(item);
		
		filter.setConjunction(Conjunction.AND);
		filter.getGroup().add(group);
		
		findCriteria.setFilter(filter);
		
		FindControl findControl = objectFactory.createFindControl();
		findControl.setRetrieveAllTranslations(true);
				
		List<Object> listSalesCustomObject = new ArrayList<Object>();
		Set<Object> objSet = new HashSet<Object>();
		do{
			findCriteria.setFetchSize(fetchSize);
			findCriteria.setFetchStart(fetchStart);
			listSalesCustomObject.clear();
			try{
				listSalesCustomObject = customObjectService.findEntity(findCriteria, findControl, objectName);			
			}catch(ServiceException se){
				log.debug("Error in findSalesCustomObjectInOscByFieldname "+se.getMessage() );
				se.printStackTrace();
			}catch(Exception e){
				log.debug("findSalesCustomObjectInOscByFieldname "+e.getMessage());
				e.printStackTrace();
			}
			objSet.addAll(listSalesCustomObject);
			fetchStart = fetchStart+500;
		}while(listSalesCustomObject.size() == 500);
		listSalesCustomObject.clear();
		log.debug("After execution "+objSet.size());
		listSalesCustomObject.addAll(objSet);
	
		log.debug("findSalesCustomObjectInOsc <<");
		return listSalesCustomObject;
	}
    
    public List<Object> getSalesCustomObjectInOscById(String objectName, List<Object> listObject) throws ServiceException{
    	String keyValue = null;
    	List<Object> lObject = new ArrayList<Object>();
    	List<String> strList = new ArrayList<String>();
       	for(Object obj : listObject){
	    		if("SampleRequest_c".equals(objectName)){
	    			SampleRequestTeamC srTeam = (SampleRequestTeamC)obj;
	    			keyValue = srTeam.getSampleRequestIdC().getValue().toString();
	    			strList.add(keyValue);
	    			Object object = customObjectService.getEntity(strList, objectName);
	    			if(null != object){
	    				lObject.add(object);
	    			}
					strList.clear();
	    		}else if("QuoteLineItem_c".equals(objectName)){
	    			QuoteLineItemTeamC qliTeam = (QuoteLineItemTeamC)obj;
	    			keyValue = qliTeam.getQuoteLineItemIdC().getValue().toString();
	    			strList.add(keyValue);
	    			Object object = customObjectService.getEntity(strList, objectName);
	    			if(null != object){
	    				lObject.add(object);
	    			}
	    			strList.clear();
	    		}
	    	
	    	}
    	return lObject;
    }
    
    
    
    public List<Object> findSCOInOscByFieldName(String objectName, String fieldName, List<String> listValues){
		log.debug("findSalesCustomObjectInOsc >>");
		
		FindCriteria findCriteria = objectFactory.createFindCriteria();
		
		int fetchStart = 0;
		int fetchSize = 500;
		
		ViewCriteria filter = new ViewCriteria();	
		ViewCriteriaRow group =  new ViewCriteriaRow();
		
		group.setConjunction(Conjunction.AND);
		group.setUpperCaseCompare(false);
		
		for(String str : listValues){
			ViewCriteriaItem item = new ViewCriteriaItem();
			item.setConjunction(Conjunction.OR);
			item.setUpperCaseCompare(false);
			item.setAttribute(fieldName);
			item.setOperator("=");
			item.getValue().add(str);
			group.getItem().add(item);
		}
		
		filter.setConjunction(Conjunction.AND);
		filter.getGroup().add(group);
		
		findCriteria.setFilter(filter);
		
		FindControl findControl = objectFactory.createFindControl();
		findControl.setRetrieveAllTranslations(true);
		
		List<Object> listSalesCustomObject = new ArrayList<Object>();
		Set<Object> objSet = new HashSet<Object>();
		do{
			findCriteria.setFetchSize(fetchSize);
			findCriteria.setFetchStart(fetchStart);
			listSalesCustomObject.clear();
			try{
				listSalesCustomObject = customObjectService.findEntity(findCriteria, findControl, objectName);			
			}catch(ServiceException se){
				log.error("Exception in findSCOInOscByFieldName "+se.getMessage());
				se.printStackTrace();
			}catch(Exception e){
				log.error("Exception in findSCOInOscByFieldName "+e.getMessage());
				e.printStackTrace();
			}
			objSet.addAll(listSalesCustomObject);
			fetchStart = fetchStart+500;
		}while(listSalesCustomObject.size() == 500);
		listSalesCustomObject.clear();
		log.debug("Total no of forecastHistory : "  +objSet.size());
		listSalesCustomObject.addAll(objSet);
		
		
		
		log.debug("findSalesCustomObjectInOsc <<");
		return listSalesCustomObject;
	}
    
   
    
    /*public void createSampleRequestTeamMember(BigDecimal srId, String teamMemberName, BigDecimal teamMemberId, String username){
    	SampleRequestTeamC srt = objectFactory.createSampleRequestTeamC();
    	srt.setAccessLevelC(objectFactory.createSampleRequestTeamCAccessLevelC("300"));
    	srt.setCorpCurrencyCode(objectFactory.createSampleRequestTeamCCorpCurrencyCode("USD"));
    	srt.setCurrencyCode(objectFactory.createSampleRequestTeamCCurrencyCode("USD"));
    	srt.setSampleRequestIdC(objectFactory.createSampleRequestTeamCSampleRequestIdC(srId));
    	//srt.setTeamMemberC(objectFactory.createSampleRequestTeamCTeamMemberC(teamMemberName));
    	srt.setTeamMemberIdC(objectFactory.createSampleRequestTeamCTeamMemberIdC(teamMemberId));
    	srt.setUsernameC(objectFactory.createSampleRequestTeamCUsernameC(username));
    	
    	try {
			customObjectService.createEntity(srt,"SampleRequestTeam_c");
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
    }
    */

    
}
