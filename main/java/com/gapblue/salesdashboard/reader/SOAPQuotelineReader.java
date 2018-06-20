package com.gapblue.salesdashboard.reader;


import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;

import com.gapblue.salesdashboard.CustomObjectOscWsClient;
import com.gapblue.salesdashboard.util.SalesDashboardUtils;
import com.gapblue.web.stubs.salescustomobject.QuoteLineItemC;

public class SOAPQuotelineReader implements ItemReader<QuoteLineItemC>,StepExecutionListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(SOAPQuotelineReader.class);

    private final String apiUrl;
    private final String user;
    private final String password;
  
    private int nextQuoteIndex;
    private List<Object> quotelineData;

    @Autowired
	public DataSource batchDataSource;
    
    private String lastruntime;
    
    public SOAPQuotelineReader(String apiUrl,String user,String password) {
        this.apiUrl = apiUrl;
        this.user=user;
        this.password=password;
        nextQuoteIndex = 0;
    }

   
    SalesDashboardUtils salesDashboardUtils = new SalesDashboardUtils();
    
      @Override
    public QuoteLineItemC read() throws Exception {
    	  LOGGER.info("Reading the information of the next QuoteLineItemC");

          if (quoteDataIsNotInitialized()) {
          	quotelineData = fetchQuoteLineDataFromAPI();
          }
          
      QuoteLineItemC quoteLineItemC =null;
      List<QuoteLineItemC> quoteLineItemCList= new ArrayList<QuoteLineItemC>();
       
          for(int i=0;i<quotelineData.size();i++)
  		{
          	quoteLineItemC = (QuoteLineItemC)quotelineData.get(i);
  	       	quoteLineItemCList.add(i, quoteLineItemC);
  		}
          
          QuoteLineItemC nextQuoteLineItemC=null;
          LOGGER.info("nextQuoteLineItemC index : "+nextQuoteIndex);
          
          if (nextQuoteIndex < quoteLineItemCList.size()) {
          	nextQuoteLineItemC = quoteLineItemCList.get(nextQuoteIndex);
              
              LOGGER.info("nextQuote index : "+nextQuoteIndex+" :::: "+nextQuoteLineItemC.getRecordName());
              nextQuoteIndex++;
          }

          LOGGER.info("Found QuoteLineItemC: {}", nextQuoteLineItemC);

          return nextQuoteLineItemC;

    }

    private boolean quoteDataIsNotInitialized() {
        return this.quotelineData == null;
    }

    private List<Object> fetchQuoteLineDataFromAPI() throws Exception {
        LOGGER.info("Fetching QuoteLineItem data from an external API by using the url: {} ", apiUrl);
     CustomObjectOscWsClient customClient = new CustomObjectOscWsClient(apiUrl, user, password);
        LOGGER.debug("Calling findQuoteline");
    	List<Object> quoteLineList = customClient.findQuoteLineWithLastUpdatedTime(lastruntime);
        LOGGER.info("Found {} QuoteLine", quoteLineList.size());

        return quoteLineList;
    }

	@Override
	public void beforeStep(StepExecution stepExecution) {
		LOGGER.debug("before step of SOAPQuotelineReader  : " + apiUrl);
		lastruntime = salesDashboardUtils.getInterfacePoolDateTime("soapQuotelineDBJob", batchDataSource);

		LOGGER.info("In before step getting last pool date::: " + lastruntime);
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		LOGGER.info("After execution of read step");
		return null;
	}
    
 
 
}
