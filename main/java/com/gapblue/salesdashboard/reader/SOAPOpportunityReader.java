package com.gapblue.salesdashboard.reader;


import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;

import com.gapblue.salesdashboard.OpportunityWsClient;
import com.gapblue.salesdashboard.util.SalesDashboardUtils;
import com.gapblue.web.stubs.opportunity.Opportunity;

public class SOAPOpportunityReader implements ItemReader<Opportunity>,StepExecutionListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(SOAPOpportunityReader.class);

    private final String apiUrl;
    private final String user;
    private final String password;
  
    private int nextOppIndex;
    private List<Opportunity> opportunityData;

    @Autowired
	public DataSource batchDataSource;
    
    private String lastruntime;
    
    public SOAPOpportunityReader(String apiUrl,String user,String password) {
        this.apiUrl = apiUrl;
        this.user=user;
        this.password=password;
        nextOppIndex = 0;
    }

   
    public SalesDashboardUtils salesDashboardUtils = new SalesDashboardUtils();
    
      @Override
    public Opportunity read() throws Exception {
        LOGGER.info("Reading the information of the next Opportunity");

        if (oppDataIsNotInitialized()) {
        	opportunityData = fetchOppDataFromAPI();
        }
        
 
        
        Opportunity nextOpp = null;
        LOGGER.info("nextOpportunity index : "+nextOppIndex);
        if (nextOppIndex < opportunityData.size()) {
            nextOpp = opportunityData.get(nextOppIndex);
            
            LOGGER.info("nextOpportunity index : "+nextOppIndex+" :::: "+nextOpp.getAccountNumber());
            nextOppIndex++;
        }

        LOGGER.info("Found Opportunity: {}", nextOpp);

        return nextOpp;
    }

    private boolean oppDataIsNotInitialized() {
        return this.opportunityData == null;
    }

    private List<Opportunity> fetchOppDataFromAPI() throws Exception {
        LOGGER.info("Fetching Opportunity data from an external API by using the url: {} ", apiUrl);

         OpportunityWsClient opportunityWsClient = new OpportunityWsClient(apiUrl,user,password);
    	List<Opportunity> opps = opportunityWsClient.findOpportunityWithLastUpdatedTime(lastruntime);
	
        LOGGER.info("Found {} opportunity", opps.size());

        return opps;
    }

	@Override
	public void beforeStep(StepExecution stepExecution) {
		LOGGER.debug("Before step of SOAPOpportunityReader  : " + apiUrl);
		lastruntime = salesDashboardUtils.getInterfacePoolDateTime("soapOpportunityDBJob", batchDataSource);

		LOGGER.debug("In before step getting last pool date::: " + lastruntime);
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		LOGGER.info("After execution of read step");
		return null;
	}
    
 
 
}
