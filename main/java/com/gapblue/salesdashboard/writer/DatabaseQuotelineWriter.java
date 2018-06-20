package com.gapblue.salesdashboard.writer;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

import com.gapblue.salesdashboard.db.QuotePreparedStatementSetter;
import com.gapblue.salesdashboard.util.SalesDashboardUtils;
import com.gapblue.web.stubs.salescustomobject.QuoteLineItemC;

@Configuration
public class DatabaseQuotelineWriter implements ItemWriter<QuoteLineItemC>, StepExecutionListener {
	private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseQuotelineWriter.class);

	private static final String QUERY_INSERT_QUOTELINE = "MERGE INTO XXINV_QUOTELINEITEM a USING "
			+ "(SELECT ? ENDCUSTOMER_C,? DISTRIBUTORNAMEINTG_C ,? QUOTESOURCE_C , ? APPROVALSTATUS_C ,? PART_C , ? PRODUCTFAMILY_C , ? MARKETSEGMENT_C , ? MARKETSUBSEGMENT_C , ? BU_C , ? QUOTETYPE_C ,? INVENSENSEREP_C , ? ANNUALQUANTITY_C , ? MINIMUMQUARTERLYVOLUMEMQV_C , ? COMPETITORNAME_C , ? "
			+ "COMPETITORPRICE_C , ? CURRENTASP_C ,? REQUESTEDASP_C , ? DISTIMARGIN_C , ? NETASP_C ,? PRICESTARTDATE_C , ? PRICEENDDATE_C , ? OVERRIDEQUOTELINESTARTDATE_C ,? OVERRIDEQUOTELINEENDDATE_C , ? QUOTELINEITEMID  FROM DUAL) incoming ON (a.QUOTELINEITEMID=incoming.QUOTELINEITEMID)"
			+ " WHEN MATCHED THEN "
			+ "UPDATE SET a.ENDCUSTOMER_C=incoming.ENDCUSTOMER_C, a.DISTRIBUTORNAMEINTG_C=incoming.DISTRIBUTORNAMEINTG_C ,a.QUOTESOURCE_C =incoming.QUOTESOURCE_C, "
			+ "a.APPROVALSTATUS_C=incoming.APPROVALSTATUS_C ,a.PART_C=incoming.PART_C ,a.PRODUCTFAMILY_C=incoming.PRODUCTFAMILY_C ,a.MARKETSEGMENT_C=incoming.MARKETSEGMENT_C,"
			+ "a.MARKETSUBSEGMENT_C=incoming.MARKETSUBSEGMENT_C ,a.BU_C=incoming.BU_C ,a.QUOTETYPE_C=incoming.QUOTETYPE_C,a.INVENSENSEREP_C=incoming.INVENSENSEREP_C ,"
			+ "a.ANNUALQUANTITY_C=incoming.ANNUALQUANTITY_C ,a.MINIMUMQUARTERLYVOLUMEMQV_C=incoming.MINIMUMQUARTERLYVOLUMEMQV_C , a.COMPETITORNAME_C=incoming.COMPETITORNAME_C ,a.COMPETITORPRICE_C=incoming.COMPETITORPRICE_C ,a.CURRENTASP_C=incoming.CURRENTASP_C ,a.REQUESTEDASP_C=incoming.REQUESTEDASP_C ,"
			+ "a.DISTIMARGIN_C=incoming.DISTIMARGIN_C ,a.NETASP_C=incoming.NETASP_C ,a.PRICESTARTDATE_C=incoming.PRICESTARTDATE_C ,a.PRICEENDDATE_C=incoming.PRICEENDDATE_C ,a.OVERRIDEQUOTELINESTARTDATE_C=incoming.OVERRIDEQUOTELINESTARTDATE_C ,a.OVERRIDEQUOTELINEENDDATE_C=incoming.OVERRIDEQUOTELINEENDDATE_C"
			+ " WHEN NOT MATCHED THEN "
			+ "INSERT (ENDCUSTOMER_C,DISTRIBUTORNAMEINTG_C ,QUOTESOURCE_C ,APPROVALSTATUS_C ,PART_C ,PRODUCTFAMILY_C ,MARKETSEGMENT_C ,MARKETSUBSEGMENT_C ,BU_C ,QUOTETYPE_C ,INVENSENSEREP_C ,ANNUALQUANTITY_C ,MINIMUMQUARTERLYVOLUMEMQV_C ,COMPETITORNAME_C ,COMPETITORPRICE_C ,CURRENTASP_C ,REQUESTEDASP_C ,DISTIMARGIN_C ,"
			+ "NETASP_C ,PRICESTARTDATE_C ,PRICEENDDATE_C ,OVERRIDEQUOTELINESTARTDATE_C ,OVERRIDEQUOTELINEENDDATE_C ,QUOTELINEITEMID ) VALUES (incoming.ENDCUSTOMER_C,incoming.DISTRIBUTORNAMEINTG_C ,incoming.QUOTESOURCE_C ,incoming.APPROVALSTATUS_C ,incoming.PART_C ,incoming.PRODUCTFAMILY_C ,incoming.MARKETSEGMENT_C ,incoming.MARKETSUBSEGMENT_C ,"
			+ "incoming.BU_C ,incoming.QUOTETYPE_C ,incoming.INVENSENSEREP_C ,incoming.ANNUALQUANTITY_C ,incoming.MINIMUMQUARTERLYVOLUMEMQV_C ,incoming.COMPETITORNAME_C ,incoming.COMPETITORPRICE_C ,incoming.CURRENTASP_C ,incoming.REQUESTEDASP_C ,incoming.DISTIMARGIN_C ,incoming.NETASP_C ,incoming.PRICESTARTDATE_C ,incoming.PRICEENDDATE_C ,"
			+ "incoming.OVERRIDEQUOTELINESTARTDATE_C ,incoming.OVERRIDEQUOTELINEENDDATE_C ,incoming.QUOTELINEITEMID)";

	SalesDashboardUtils salesDashboardUtils = new SalesDashboardUtils();

	@Autowired
	@Qualifier("secondaryDataSource")
	private DataSource secondaryDataSource;

	@Autowired
	@Qualifier("batchDatasource")
	public DataSource batchDatasource;

	@Override
	public void write(List<? extends QuoteLineItemC> items) throws Exception {

		LOGGER.info("Write to database: ");
		JdbcBatchItemWriter<QuoteLineItemC> databaseItemWriter = new JdbcBatchItemWriter<>();
		databaseItemWriter.setDataSource(secondaryDataSource);
		databaseItemWriter.setSql(QUERY_INSERT_QUOTELINE);

		ItemPreparedStatementSetter<QuoteLineItemC> quotePreparedStatementSetter = new QuotePreparedStatementSetter();

		databaseItemWriter.setItemPreparedStatementSetter(quotePreparedStatementSetter);

		databaseItemWriter.write(items);
		LOGGER.debug("Completed In DB Writer" + items.size());

	}

	@Override
	public void beforeStep(StepExecution stepExecution) {

	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		LOGGER.debug("SOAPQuoteLineDB job completed successfully");
		if (stepExecution.getStatus() == BatchStatus.COMPLETED) {
			LOGGER.info("SOAPQuoteLineDB job completed successfully");
			salesDashboardUtils.setInterfacePoolDateTime("soapQuotelineDBJob", batchDatasource);

		}

		return null;
	}

}
