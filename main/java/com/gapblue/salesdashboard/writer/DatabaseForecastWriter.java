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

import com.gapblue.salesdashboard.db.ForecastPreparedStatementSetter;
import com.gapblue.salesdashboard.util.SalesDashboardUtils;
import com.gapblue.web.stubs.salescustomobject.ForecastCustomC;

@Configuration
public class DatabaseForecastWriter implements ItemWriter<ForecastCustomC>,StepExecutionListener{
	private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseForecastWriter.class);

	 
	 private static final String QUERY_INSERT_FORECASTHISTORY="MERGE INTO XXINV_FORECAST a USING (SELECT ? Id , ? RecordName ,? ObjectVersionNumber ,? CpdrfVerSor ,? JobDefinitionPackage ,? RequestId , "+
			 " ? JobDefinitionName ,? CurrencyCode ,? CurcyConvRateType ,? CorpCurrencyCode ,? SourceType ,? AttachmentEntityName ,? PKProxy ,? IsOwner ,? Revenue_c "+
			 ",? ASP_c ,? Quantity_c ,? Owner_Id_c ,? Owner_c ,? Forecast_Id_c ,? Forecast_c ,? LockedMonth_c ,? LockedYear_c ,? LockedByID_c ,? LockedByUserName_c ,"+
			 "? ForecastType_c ,? ProgramName_c ,? Market_c ,? SubMarket_c ,? BU_c ,? Role_c ,? ParentEndCustomer_Id_c,? ParentEndCustomer_c ,? Opportunity_Id_c ,"+
			 "? Opportunity_c ,? Part_Id_c ,? Part_c ,? ProductCategory_c ,? Year_c ,? ASP1_c ,? ASP2_c ,? ASP3_c ,? ASP4_c ,? ASP5_c ,? ASP6_c ,? ASP7_c ,? ASP8_c ,"+
			 "? ASP9_c,? ASP10_c ,? ASP11_c ,? ASP12_c ,? QuarterCY_c ,? Quantity1_c ,? Quantity2_c ,? Quantity3_c ,? Quantity4_c ,? Quantity5_c ,? Quantity6_c ,"+
			 "? Quantity7_c ,? Quantity8_c ,? Quantity9_c ,? Quantity10_c  ,? Quantity11_c ,? Quantity12_c ,? EndCustomer_Id_c ,? EndCustomer_c ,? CRMRowID_c ,"+
			 "? OwnerMobile_c ,? PartMobile_c ,? Market1_c ,? SubMarket1_c ,? BU1_c ,? ForecastDate_c ,? ForecastRecordType_c ,? ASPQ1_c ,? ASPQ2_c ,? ASPQ3_c ,"+
			 "? ASPQ4_c ,? QTYQ1_c ,? QTYQ2_c ,? QTYQ3_c ,? QTYQ4_c ,? INTG_c  ,? ASP101_c ,? ASP201_c ,? ASP301_c ,? ASP401_c ,? ASP501_c ,? ASP601_c ,? ASP701_c ,"+
			 "? ASP801_c ,? ASP901_c ,? ASP100_c ,? ASP111_c ,? ASP122_c ,? ASPQ11_c ,? ASPQ22_c ,? ASPQ33_c ,? ASPQ44_c ,? Cost_c ,? CreationDate_c ,? REV1_c ,? REV2_c ,"+
			 "? REV3_c ,? REV4_c ,? REV5_c ,? REV6_c,? REV7_c,? REV8_c ,? REV9_c ,? REV10_c ,? REV11_c ,? REV12_c ,? REVQ1_c ,? REVQ2_c ,? REVQ3_c ,? REVQ4_c,? ORGANIZATION FROM dual)"+
			 " incoming ON (a.Id = incoming.Id ) WHEN MATCHED THEN UPDATE SET "+
			 "a.RecordName=incoming.RecordName,a.ObjectVersionNumber=incoming.ObjectVersionNumber,a.CpdrfVerSor=incoming.CpdrfVerSor, "+
			 "a.JobDefinitionPackage=incoming.JobDefinitionPackage,a.RequestId =incoming.RequestId,a.JobDefinitionName=incoming.JobDefinitionName,"+
			 "a.CurrencyCode =incoming.CurrencyCode,a.CurcyConvRateType=incoming.CurcyConvRateType,a.CorpCurrencyCode=incoming.CorpCurrencyCode,"+
			 "a.SourceType=incoming.SourceType,a.AttachmentEntityName=incoming.AttachmentEntityName,a.PKProxy=incoming.PKProxy,a.IsOwner=incoming.IsOwner,"+
			 "a.Revenue_c=incoming.Revenue_c,a.ASP_c=incoming.ASP_c,a.Quantity_c=incoming.Quantity_c,a.Owner_Id_c=incoming.Owner_Id_c,a.Owner_c=incoming.Owner_c,"+
			 "a.Forecast_Id_c=incoming.Forecast_Id_c,a.Forecast_c=incoming.Forecast_c,a.LockedMonth_c=incoming.LockedMonth_c,a.LockedYear_c=incoming.LockedYear_c,"+
			 "a.LockedByID_c=incoming.LockedByID_c,a.LockedByUserName_c=incoming.LockedByUserName_c,a.ForecastType_c=incoming.ForecastType_c,"+
			 "a.ProgramName_c=incoming.ProgramName_c,a.Market_c=incoming.Market_c,a.SubMarket_c =incoming.SubMarket_c,a.BU_c=incoming.BU_c,a.Role_c=incoming.Role_c,"+
			 "a.ParentEndCustomer_Id_c=incoming.ParentEndCustomer_Id_c,a.ParentEndCustomer_c=incoming.ParentEndCustomer_c,a.Opportunity_Id_c=incoming.Opportunity_Id_c,"+
			 "a.Opportunity_c=incoming.Opportunity_c,a.Part_Id_c=incoming.Part_Id_c,a.Part_c=incoming.Part_c,a.ProductCategory_c=incoming.ProductCategory_c,"+
			 "a.Year_c=incoming.Year_c,a.ASP1_c=incoming.ASP1_c,a.ASP2_c=incoming.ASP2_c,a.ASP3_c=incoming.ASP3_c,a.ASP4_c=incoming.ASP4_c,a.ASP5_c=incoming.ASP5_c,"+
			 "a.ASP6_c=incoming.ASP6_c,a.ASP7_c=incoming.ASP7_c,a.ASP8_c=incoming.ASP8_c,a.ASP9_c=incoming.ASP9_c,a.ASP10_c=incoming.ASP10_c,a.ASP11_c=incoming.ASP11_c,"+
			 "a.ASP12_c=incoming.ASP12_c,a.QuarterCY_c =incoming.QuarterCY_c,a.Quantity1_c=incoming.Quantity1_c,a.Quantity2_c =incoming.Quantity2_c,"+
			 "a.Quantity3_c=incoming.Quantity3_c,a.Quantity4_c=incoming.Quantity4_c,a.Quantity5_c =incoming.Quantity5_c,a.Quantity6_c=incoming.Quantity6_c,"+
			 "a.Quantity7_c=incoming.Quantity7_c,a.Quantity8_c=incoming.Quantity8_c,a.Quantity9_c =incoming.Quantity9_c,a.Quantity10_c=incoming.Quantity10_c,"+
			 "a.Quantity11_c =incoming.Quantity11_c,a.Quantity12_c=incoming.Quantity12_c,a.EndCustomer_Id_c=incoming.EndCustomer_Id_c,a.EndCustomer_c=incoming.EndCustomer_c,"+
			 "a.CRMRowID_c=incoming.CRMRowID_c,a.OwnerMobile_c=incoming.OwnerMobile_c,a.PartMobile_c=incoming.PartMobile_c,a.Market1_c=incoming.Market1_c,"+
			 "a.SubMarket1_c=incoming.SubMarket1_c,a.BU1_c =incoming.BU1_c,a.ForecastDate_c =incoming.ForecastDate_c,a.ForecastRecordType_c=incoming.ForecastRecordType_c,"+
			 "a.ASPQ1_c=incoming.ASP1_c,a.ASPQ2_c=incoming.ASP2_c,a.ASPQ3_c=incoming.ASP3_c,a.ASPQ4_c=incoming.ASP4_c, a.QTYQ1_c=incoming.QTYQ1_c,"+
			 "a.QTYQ2_c=incoming.QTYQ2_c,a.QTYQ3_c=incoming.QTYQ3_c,a.QTYQ4_c=incoming.QTYQ4_c,a.INTG_c=incoming.INTG_c,a.ASP101_c=incoming.ASP101_c,"+
			 "a.ASP201_c=incoming.ASP201_c,a.ASP301_c=incoming.ASP301_c, a.ASP401_c=incoming.ASP401_c, a.ASP501_c=incoming.ASP501_c, a.ASP601_c=incoming.ASP601_c, "+
			 "a.ASP701_c=incoming.ASP701_c, a.ASP801_c=incoming.ASP801_c, a.ASP901_c=incoming.ASP901_c, a.ASP100_c=incoming.ASP100_c, a.ASP111_c=incoming.ASP111_c,"+
			 "a.ASP122_c=incoming.ASP122_c,a.ASPQ11_c=incoming.ASPQ11_c, a.ASPQ22_c=incoming.ASPQ22_c,a.ASPQ33_c=incoming.ASPQ33_c,a.ASPQ44_c=incoming.ASPQ44_c,"+
			 "a.Cost_c =incoming.Cost_c,a.CreationDate_c=incoming.CreationDate_c,a.REV1_c=incoming.REV1_c,a.REV2_c=incoming.REV2_c,a.REV3_c=incoming.REV3_c,"+
			 "a.REV4_c=incoming.REV4_c,a.REV5_c=incoming.REV5_c,a.REV6_c=incoming.REV6_c,a.REV7_c=incoming.REV7_c,a.REV8_c=incoming.REV8_c,a.REV9_c=incoming.REV9_c,"+
			 "a.REV10_c=incoming.REV10_c,a.REV11_c=incoming.REV11_c,a.REV12_c=incoming.REV12_c,a.REVQ1_c=incoming.REVQ2_c,a.REVQ3_c=incoming.REVQ3_c,"+
			 "a.REVQ4_c=incoming.REVQ4_c,a.ORGANIZATION=incoming.ORGANIZATION"+
			 " WHEN NOT MATCHED THEN INSERT "+
			 "(Id,RecordName, ObjectVersionNumber, CpdrfVerSor ,JobDefinitionPackage ,RequestId ,JobDefinitionName ,CurrencyCode ,CurcyConvRateType ,CorpCurrencyCode ,"+
			 "SourceType,AttachmentEntityName,PKProxy,IsOwner,Revenue_c ,ASP_c ,Quantity_c ,Owner_Id_c ,Owner_c ,Forecast_Id_c ,Forecast_c ,LockedMonth_c ,LockedYear_c ,"+
			 "LockedByID_c,LockedByUserName_c,ForecastType_c ,ProgramName_c ,Market_c ,SubMarket_c ,BU_c ,Role_c ,ParentEndCustomer_Id_c,ParentEndCustomer_c ,"+
			 "Opportunity_Id_c ,Opportunity_c ,Part_Id_c ,Part_c ,ProductCategory_c ,Year_c ,ASP1_c ,ASP2_c ,ASP3_c ,ASP4_c ,ASP5_c ,ASP6_c ,ASP7_c ,ASP8_c ,ASP9_c ,"+
			 "ASP10_c,ASP11_c ,ASP12_c ,QuarterCY_c ,Quantity1_c ,Quantity2_c ,Quantity3_c ,Quantity4_c ,Quantity5_c ,Quantity6_c ,Quantity7_c ,Quantity8_c ,Quantity9_c ,"+
			 "Quantity10_c ,Quantity11_c ,Quantity12_c ,EndCustomer_Id_c ,EndCustomer_c ,CRMRowID_c ,OwnerMobile_c ,PartMobile_c ,Market1_c ,SubMarket1_c ,BU1_c,"+
			 "ForecastDate_c,ForecastRecordType_c ,ASPQ1_c ,ASPQ2_c ,ASPQ3_c ,ASPQ4_c ,QTYQ1_c ,QTYQ2_c ,QTYQ3_c ,QTYQ4_c ,INTG_c  ,ASP101_c ,ASP201_c ,ASP301_c ,"+
			 "ASP401_c ,ASP501_c ,ASP601_c ,ASP701_c ,ASP801_c ,ASP901_c ,ASP100_c ,ASP111_c ,ASP122_c ,ASPQ11_c ,ASPQ22_c ,ASPQ33_c ,ASPQ44_c ,Cost_c ,CreationDate_c ,"+
			 "REV1_c ,REV2_c ,REV3_c ,REV4_c ,REV5_c ,REV6_c ,REV7_c ,REV8_c ,REV9_c ,REV10_c ,REV11_c ,REV12_c ,REVQ1_c ,REVQ2_c ,REVQ3_c ,REVQ4_c,ORGANIZATION) VALUES "+
			 "(incoming.Id,incoming.RecordName,incoming.ObjectVersionNumber,incoming.CpdrfVerSor ,incoming.JobDefinitionPackage ,incoming.RequestId ,incoming.JobDefinitionName ,incoming.CurrencyCode ,incoming.CurcyConvRateType ,incoming.CorpCurrencyCode ,"+
			 "incoming.SourceType,incoming.AttachmentEntityName,incoming.PKProxy,incoming.IsOwner,incoming.Revenue_c ,incoming.ASP_c ,incoming.Quantity_c ,incoming.Owner_Id_c ,incoming.Owner_c ,incoming.Forecast_Id_c ,incoming.Forecast_c ,incoming.LockedMonth_c ,incoming.LockedYear_c ,incoming."+
			 "LockedByID_c,incoming.LockedByUserName_c,incoming.ForecastType_c ,incoming.ProgramName_c ,incoming.Market_c ,incoming.SubMarket_c ,incoming.BU_c ,incoming.Role_c ,incoming.ParentEndCustomer_Id_c,incoming.ParentEndCustomer_c ,incoming."+
			 "Opportunity_Id_c ,incoming.Opportunity_c ,incoming.Part_Id_c ,incoming.Part_c ,incoming.ProductCategory_c ,incoming.Year_c ,incoming.ASP1_c ,incoming.ASP2_c ,incoming.ASP3_c ,incoming.ASP4_c ,incoming.ASP5_c ,incoming.ASP6_c ,incoming.ASP7_c ,incoming.ASP8_c ,incoming.ASP9_c ,incoming."+
			 "ASP10_c,incoming.ASP11_c ,incoming.ASP12_c ,incoming.QuarterCY_c ,incoming.Quantity1_c ,incoming.Quantity2_c ,incoming.Quantity3_c ,incoming.Quantity4_c ,incoming.Quantity5_c ,incoming.Quantity6_c ,incoming.Quantity7_c ,incoming.Quantity8_c ,incoming.Quantity9_c ,incoming."+
			 "Quantity10_c ,incoming.Quantity11_c ,incoming.Quantity12_c ,incoming.EndCustomer_Id_c ,incoming.EndCustomer_c ,incoming.CRMRowID_c ,incoming.OwnerMobile_c ,incoming.PartMobile_c ,incoming.Market1_c ,incoming.SubMarket1_c ,incoming.BU1_c,incoming."+
			 "ForecastDate_c,incoming.ForecastRecordType_c ,incoming.ASPQ1_c ,incoming.ASPQ2_c ,incoming.ASPQ3_c ,incoming.ASPQ4_c ,incoming.QTYQ1_c ,incoming.QTYQ2_c ,incoming.QTYQ3_c ,incoming.QTYQ4_c ,incoming.INTG_c  ,incoming.ASP101_c ,incoming.ASP201_c ,incoming.ASP301_c ,incoming."+
			 "ASP401_c ,incoming.ASP501_c ,incoming.ASP601_c ,incoming.ASP701_c ,incoming.ASP801_c ,incoming.ASP901_c ,incoming.ASP100_c ,incoming.ASP111_c ,incoming.ASP122_c ,incoming.ASPQ11_c ,incoming.ASPQ22_c ,incoming.ASPQ33_c ,incoming.ASPQ44_c ,incoming.Cost_c ,incoming.CreationDate_c ,incoming."+
			 "REV1_c ,incoming.REV2_c ,incoming.REV3_c ,incoming.REV4_c ,incoming.REV5_c ,incoming.REV6_c ,incoming.REV7_c ,incoming.REV8_c ,incoming.REV9_c ,incoming.REV10_c ,incoming.REV11_c ,incoming.REV12_c ,incoming.REVQ1_c ,incoming.REVQ2_c ,incoming.REVQ3_c ,incoming.REVQ4_c,incoming.ORGANIZATION)";
	 SalesDashboardUtils salesDashboardUtils= new SalesDashboardUtils();
	 
@Autowired
@Qualifier("secondaryDataSource")
private DataSource secondaryDataSource;



@Autowired
@Qualifier("batchDatasource")
public DataSource batchDatasource;


	 

			@Override
			public void beforeStep(StepExecution stepExecution) {
				
				
			}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		LOGGER.debug("soapForecastDBJob job completed successfully");
		if (stepExecution.getStatus() == BatchStatus.COMPLETED) {
			LOGGER.info("soapForecastDBJob job completed successfully");
			salesDashboardUtils.setInterfacePoolDateTime("soapForecastDBJob", batchDatasource);

		}

		return null;
	}


			@Override
			public void write(List<? extends ForecastCustomC> items) throws Exception {
				LOGGER.debug("Write to database: ");
			  JdbcBatchItemWriter<ForecastCustomC> databaseItemWriter = new JdbcBatchItemWriter<>();
      databaseItemWriter.setDataSource(secondaryDataSource);
      databaseItemWriter.setSql(QUERY_INSERT_FORECASTHISTORY);
  	LOGGER.debug("Datasource for data :: "+secondaryDataSource);
      ItemPreparedStatementSetter<ForecastCustomC> forecastPreparedStatementSetter = new ForecastPreparedStatementSetter();

		databaseItemWriter.setItemPreparedStatementSetter(forecastPreparedStatementSetter);
		databaseItemWriter.write(items);
		LOGGER.debug("Completed In DB Writer"+items.size());
		
				
			}
			
		
}
