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
import com.gapblue.web.stubs.salescustomobject.ForecastHistoryC;

public class SOAPForecastHistoryReader implements ItemReader<ForecastHistoryC>,StepExecutionListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(SOAPForecastHistoryReader.class);

    private final String apiUrl;
    private final String user;
    private final String password;
  
    private int nextForecastIndex;
    private List<Object> forecastHistoryData;

    @Autowired
	public DataSource batchDataSource;
    
    private String lastruntime;
    private String batchIdentifier;
    
    public SOAPForecastHistoryReader(String apiUrl,String user,String password) {
        this.apiUrl = apiUrl;
        this.user=user;
        this.password=password;
        nextForecastIndex = 0;
    }

   
    public SalesDashboardUtils salesDashboardUtils = new SalesDashboardUtils();
    
      @Override
    public ForecastHistoryC read() throws Exception {
        LOGGER.debug("Reading the information of the next ForecastHistoryC");

        if (forecastDataIsNotInitialized()) {
        	forecastHistoryData = fetchForecastDataFromAPI();
        }
        
        ForecastHistoryC forecastHistoryC=null;
        List<ForecastHistoryC> forecastHistoryCList = new ArrayList<ForecastHistoryC>();
        for(int i=0;i<forecastHistoryData.size();i++)
		{
        	forecastHistoryC = (ForecastHistoryC)forecastHistoryData.get(i);
			forecastHistoryCList.add(i, forecastHistoryC);
		}
        
        ForecastHistoryC nextForecastHistory = null;
        
        if (nextForecastIndex < forecastHistoryCList.size()) {
        	nextForecastHistory = forecastHistoryCList.get(nextForecastIndex);
            
            LOGGER.debug("nextForecastHistoryC index : "+nextForecastIndex+" :::: "+nextForecastHistory.getRecordName());
            nextForecastIndex++;
        }

        LOGGER.debug("Found ForecastHistoryC: {}", nextForecastHistory);

        return nextForecastHistory;
    }

    private boolean forecastDataIsNotInitialized() {
        return this.forecastHistoryData == null;
    }

    private List<Object> fetchForecastDataFromAPI() throws Exception {
        LOGGER.info("Fetching forecast data from an external API by using the url: {} ", apiUrl);

         CustomObjectOscWsClient customClient = new CustomObjectOscWsClient(apiUrl, user, password);
   
    	List<Object> fHistoryList = customClient.findForecastHistoryWithLastUpdatedTime(lastruntime,batchIdentifier);
   
        LOGGER.info("Found {} ForecastHistoryC", fHistoryList.size());

        return fHistoryList;
    }

	@Override
	public void beforeStep(StepExecution stepExecution) {
		LOGGER.debug("Before step of SOAPForecastReader  : " + apiUrl);
		lastruntime = salesDashboardUtils.getInterfacePoolDateTime("soapForecastHDBJob", batchDataSource);
		LOGGER.debug("In before step getting last pool date::: " + lastruntime);
		batchIdentifier = salesDashboardUtils.getInterfaceIdentifier("soapForecastHDBJob", batchDataSource);
		LOGGER.debug("In before step getting batch identifier::: " + batchIdentifier);
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		LOGGER.info("After execution of read step");
		return null;
	}
    
 
 
}
