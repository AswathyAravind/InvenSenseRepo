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

import com.gapblue.salesdashboard.processor.LoggingAccountResourceProcessor;
import com.gapblue.salesdashboard.reader.SOAPAccResourceReader;
import com.gapblue.salesdashboard.writer.DatabaseAccResourceWriter;
import com.gapblue.web.stubs.accountresource.SalesAccountResource;

@Configuration
@EnableBatchProcessing
public class SOAPAccResourceDBJobConfig {

    private static final String PROPERTY_REST_API_URL = "soap.accresourceapi.to.database.job.api.url";
    private static final String PROPERTY_REST_API_USER = "soap.accresourceapi.to.database.job.api.user";
    private static final String PROPERTY_REST_API_PASSWORD = "soap.accresourceapi.to.database.job.api.password";

    private static final Logger LOGGER = LoggerFactory.getLogger(SOAPAccResourceDBJobConfig.class);
    
     @Bean
    ItemReader<SalesAccountResource> soapAccResourceReader(Environment environment) {
        return new SOAPAccResourceReader(environment.getRequiredProperty(PROPERTY_REST_API_URL),environment.getRequiredProperty(PROPERTY_REST_API_USER),environment.getRequiredProperty(PROPERTY_REST_API_PASSWORD));
    }

    @Bean
    ItemProcessor<SalesAccountResource, SalesAccountResource> soapAccResourceProcessor() {
        return new LoggingAccountResourceProcessor();
    }

    @Bean
    ItemWriter<SalesAccountResource> databaseSalesAccWriter(){
    	 return new DatabaseAccResourceWriter();
    }
  
	
	@Bean
    public BatchConfigurer configurer(DataSource batchDataSource){
        return new DefaultBatchConfigurer(batchDataSource);
    }
	
 
    @Bean
    Step soapAccResourceDBStep(ItemReader<SalesAccountResource> soapAccResourceReader,
                         ItemProcessor<SalesAccountResource, SalesAccountResource> soapAccResourceProcessor,
                         ItemWriter<SalesAccountResource> databaseAccResourceWriter,
                         StepBuilderFactory stepBuilderFactory) {
    	LOGGER.info("Executing soapAccResourceDBStep");
        return stepBuilderFactory.get("soapAccResourceDBStep")
                .<SalesAccountResource, SalesAccountResource>chunk(1)
                .reader(soapAccResourceReader)
                .processor(soapAccResourceProcessor)
                .writer(databaseSalesAccWriter())
                .build();
    }

    @Bean
    Job soapAccResourceDBJob(JobBuilderFactory jobBuilderFactory,
                       @Qualifier("soapAccResourceDBStep") Step soapAccResourceDBStep) {
        return jobBuilderFactory.get("soapAccResourceDBJob")
                .incrementer(new RunIdIncrementer())
                .flow(soapAccResourceDBStep)
                .end()
                .build();
    }
}
