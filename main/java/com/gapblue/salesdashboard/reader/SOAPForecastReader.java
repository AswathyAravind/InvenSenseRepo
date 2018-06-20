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
import com.gapblue.web.stubs.salescustomobject.ForecastCustomC;

public class SOAPForecastReader implements ItemReader<ForecastCustomC>,StepExecutionListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(SOAPForecastReader.class);

    private final String apiUrl;
    private final String user;
    private final String password;
  
    private int nextForecastIndex;
    private List<Object> forecastHistoryData;

    @Autowired
	public DataSource batchDataSource;
    
    private String lastruntime;
    
    public SOAPForecastReader(String apiUrl,String user,String password) {
        this.apiUrl = apiUrl;
        this.user=user;
        this.password=password;
        nextForecastIndex = 0;
    }

   
    public SalesDashboardUtils salesDashboardUtils = new SalesDashboardUtils();
    
      @Override
    public ForecastCustomC read() throws Exception {
        LOGGER.info("Reading the information of the next ForecastHistoryC");

        if (forecastDataIsNotInitialized()) {
        	forecastHistoryData = fetchForecastDataFromAPI();
        }
        
       ForecastCustomC forecastHistoryC=null;
        List<ForecastCustomC> forecastHistoryCList = new ArrayList<ForecastCustomC>();
     
        for(int i=0;i<forecastHistoryData.size();i++)
		{
        	forecastHistoryC = (ForecastCustomC)forecastHistoryData.get(i);
	     	forecastHistoryCList.add(i, forecastHistoryC);
		}
        
         ForecastCustomC nextForecastHistory=null;
        LOGGER.info("nextForecastHistoryC index : "+nextForecastIndex);
        if (nextForecastIndex < forecastHistoryCList.size()) {
        	nextForecastHistory = forecastHistoryCList.get(nextForecastIndex);
            
            LOGGER.info("nextForecast index : "+nextForecastIndex+" :::: "+nextForecastHistory.getRecordName());
            nextForecastIndex++;
        }

        LOGGER.info("Found ForecastHistoryC: {}", nextForecastHistory);

        return nextForecastHistory;
    }

    private boolean forecastDataIsNotInitialized() {
        return this.forecastHistoryData == null;
    }

	private List<Object> fetchForecastDataFromAPI() throws Exception {
		LOGGER.debug("Fetching forecast data from an external API by using the url: {}  ", apiUrl);

		CustomObjectOscWsClient customClient = new CustomObjectOscWsClient(apiUrl, user, password);

		List<Object> fHistoryList = customClient.findForecastWithLastUpdatedTime(lastruntime);

		LOGGER.debug("Found {} ForecastCustomC", fHistoryList.size());

		return fHistoryList;
	}

	@Override
	public void beforeStep(StepExecution stepExecution) {
		LOGGER.debug("Before step of SOAPForecastReader  : "+apiUrl);
	lastruntime=salesDashboardUtils.getInterfacePoolDateTime("soapForecastDBJob",batchDataSource);
	LOGGER.debug("In before step getting last pool date::: "+lastruntime);
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		LOGGER.info("After execution of read step");
		return null;
	}
    
 
 
}
