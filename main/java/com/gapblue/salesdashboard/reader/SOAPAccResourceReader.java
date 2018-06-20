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

import com.gapblue.salesdashboard.AccountResourceOscWsClient;
import com.gapblue.salesdashboard.util.SalesDashboardUtils;
import com.gapblue.web.stubs.accountresource.SalesAccountResource;

public class SOAPAccResourceReader implements ItemReader<SalesAccountResource>, StepExecutionListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(SOAPAccResourceReader.class);

	private final String apiUrl;
	private final String user;
	private final String password;

	private int nextAccResIndex;
	private List<SalesAccountResource> accResourceData;

	@Autowired
	public DataSource batchDataSource;

	private String lastruntime;

	public SOAPAccResourceReader(String apiUrl, String user, String password) {
		this.apiUrl = apiUrl;
		this.user = user;
		this.password = password;
		nextAccResIndex = 0;
	}

	public SalesDashboardUtils salesDashboardUtils = new SalesDashboardUtils();

	@Override
	public SalesAccountResource read() throws Exception {
		LOGGER.info("Reading the information of the next Sales account resource");

		if (accResDataIsNotInitialized()) {
			accResourceData = fetchAccResDataFromAPI();
		}

		SalesAccountResource nextAccRes = null;
		LOGGER.info("nextSalesAccountResource index : " + nextAccResIndex);
		if (nextAccResIndex < accResourceData.size()) {
			nextAccRes = accResourceData.get(nextAccResIndex);

			LOGGER.info("nextaccResourceData index : " + nextAccResIndex + " :::: " + nextAccRes.getPartyName());
			nextAccResIndex++;
		}

		LOGGER.info("Found SalesAccountResource: {}", nextAccRes);

		return nextAccRes;
	}

	private boolean accResDataIsNotInitialized() {
		return this.accResourceData == null;
	}

	private List<SalesAccountResource> fetchAccResDataFromAPI() throws Exception {
		LOGGER.info("Fetching Acc resource data from an external API by using the url: {}  ", apiUrl);

		AccountResourceOscWsClient accountResourceOscWsClient = new AccountResourceOscWsClient(apiUrl, user, password);
		List<SalesAccountResource> accRes = accountResourceOscWsClient.findAccResourceWithLastUpdatedTime(lastruntime);
		LOGGER.info("Found {} SalesAccountResource", accRes.size());

		return accRes;
	}

	@Override
	public void beforeStep(StepExecution stepExecution) {
		LOGGER.debug("before step of SOAPAccResourceReader  : " + apiUrl);
		lastruntime = salesDashboardUtils.getInterfacePoolDateTime("soapAccResourceDBJob", batchDataSource);
		LOGGER.debug("In before step getting last pool date::: " + lastruntime);
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		LOGGER.info("After execution of read step");
		return null;
	}

}
