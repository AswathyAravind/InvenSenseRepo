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

import com.gapblue.salesdashboard.db.SalesAccResPreparedStatementSetter;
import com.gapblue.salesdashboard.util.SalesDashboardUtils;
import com.gapblue.web.stubs.accountresource.SalesAccountResource;

@Configuration
public class DatabaseAccResourceWriter implements ItemWriter<SalesAccountResource>,StepExecutionListener{
	private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseAccResourceWriter.class);

		private static final String QUERY_INSERT_ACCRESOURCE ="MERGE INTO XXINV_SALESACCOUNTRESOURCE a " +
			"USING (SELECT ? ResourceId, ? SAccountResourceId,? PartyName,? ResourcePrimaryOrgName,? Organization FROM dual) incoming "+
			"ON (a.ResourceId = incoming.ResourceId ) "+ 
			"WHEN MATCHED THEN "+
			"UPDATE SET SAccountResourceId = incoming.SAccountResourceId, PartyName=incoming.PartyName, ResourcePrimaryOrgName=incoming.ResourcePrimaryOrgName, Organization=incoming.Organization "+
			"WHEN NOT MATCHED THEN "+
			"INSERT "+ 
			"VALUES (incoming.ResourceId, incoming.SAccountResourceId,incoming.PartyName,incoming.ResourcePrimaryOrgName,incoming.Organization)";
	
	 SalesDashboardUtils salesDashboardUtils= new SalesDashboardUtils();
	 
@Autowired
@Qualifier("secondaryDataSource")
private DataSource secondaryDataSource;



@Autowired
@Qualifier("batchDatasource")
public DataSource batchDatasource;

 
			@Override
			public void write(List<? extends SalesAccountResource> items) throws Exception {
				
				LOGGER.debug("Write to database: ");
							  JdbcBatchItemWriter<SalesAccountResource> databaseItemWriter = new JdbcBatchItemWriter<>();
			        databaseItemWriter.setDataSource(secondaryDataSource);
			        databaseItemWriter.setSql(QUERY_INSERT_ACCRESOURCE);
			    	LOGGER.debug("Datasource for data :: "+secondaryDataSource);
			        ItemPreparedStatementSetter<SalesAccountResource> salesAccResPreparedStatementSetter = new SalesAccResPreparedStatementSetter();

					databaseItemWriter.setItemPreparedStatementSetter(salesAccResPreparedStatementSetter);
			
					databaseItemWriter.write(items);
					LOGGER.debug("Completed In DB Writer1"+items.size());
				
						
			   	}


			@Override
			public void beforeStep(StepExecution stepExecution) {
				
				
			}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		LOGGER.debug("soapAccResourceDBJob job completed successfully");
		if (stepExecution.getStatus() == BatchStatus.COMPLETED) {
			LOGGER.debug("soapAccResourceDBJob job completed successfully");
			salesDashboardUtils.setInterfacePoolDateTime("soapAccResourceDBJob", batchDatasource);

		}

		return null;
	}
			
		
}
