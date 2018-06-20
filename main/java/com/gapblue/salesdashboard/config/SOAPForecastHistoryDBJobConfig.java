package com.gapblue.salesdashboard.config;



import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.BatchConfigurer;
import org.springframework.batch.core.configuration.annotation.DefaultBatchConfigurer;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.gapblue.salesdashboard.processor.LoggingForecastHistoryProcessor;
import com.gapblue.salesdashboard.reader.SOAPForecastHistoryReader;
import com.gapblue.salesdashboard.writer.DatabaseForecastHistoryWriter;
import com.gapblue.web.stubs.salescustomobject.ForecastHistoryC;

@Configuration
@EnableBatchProcessing
public class SOAPForecastHistoryDBJobConfig {

    private static final String PROPERTY_REST_API_URL = "soap.forecasthapi.to.database.job.api.url";
    private static final String PROPERTY_REST_API_USER = "soap.forecasthapi.to.database.job.api.user";
    private static final String PROPERTY_REST_API_PASSWORD = "soap.forecasthapi.to.database.job.api.password";

    private static final Logger LOGGER = LoggerFactory.getLogger(SOAPForecastHistoryDBJobConfig.class);
    
   
     @Bean
     ItemReader<ForecastHistoryC> soapForecastHReader(Environment environment) {
         return new SOAPForecastHistoryReader(environment.getRequiredProperty(PROPERTY_REST_API_URL),environment.getRequiredProperty(PROPERTY_REST_API_USER),environment.getRequiredProperty(PROPERTY_REST_API_PASSWORD));
     }
    @Bean
    ItemProcessor<ForecastHistoryC, ForecastHistoryC> soapForecastHistoryProcessor() {
        return new LoggingForecastHistoryProcessor();
    }

    @Bean
    ItemWriter<ForecastHistoryC> databaseForecastHWriter(){
    	 return new DatabaseForecastHistoryWriter();
    }
  
	
	@Bean
    public BatchConfigurer configurer(DataSource batchDataSource){
        return new DefaultBatchConfigurer(batchDataSource);
    }
	
 
    @Bean
    Step soapForecastHDBStep(ItemReader<ForecastHistoryC> soapForecastHReader,
                         ItemProcessor<ForecastHistoryC, ForecastHistoryC> soapForecastHistoryProcessor,
                         ItemWriter<ForecastHistoryC> databaseForecastHWriter,
                         StepBuilderFactory stepBuilderFactory) {
    	LOGGER.info("Executing soapForecastHDBStep");
        return stepBuilderFactory.get("soapForecastHDBStep")
                .<ForecastHistoryC, ForecastHistoryC>chunk(10)
                .reader(soapForecastHReader)
                .processor(soapForecastHistoryProcessor)
                .writer(databaseForecastHWriter())
                .build();
    }
    

    @Bean
    Job soapForecastHDBJob(JobBuilderFactory jobBuilderFactory,
                       @Qualifier("soapForecastHDBStep") Step soapForecastHDBStep) {
        return jobBuilderFactory.get("soapForecastHDBJob")
                .incrementer(new RunIdIncrementer())
                .flow(soapForecastHDBStep)
                .end()
                .build();
    }
}
