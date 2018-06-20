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

import com.gapblue.salesdashboard.processor.LoggingOpportunityProcessor;
import com.gapblue.salesdashboard.reader.SOAPOpportunityReader;
import com.gapblue.salesdashboard.writer.DatabaseOpportunityWriter;
import com.gapblue.web.stubs.opportunity.Opportunity;

@Configuration
@EnableBatchProcessing
public class SOAPOpportunityDBJobConfig {

    private static final String PROPERTY_REST_API_URL = "soap.opportunityapi.to.database.job.api.url";
    private static final String PROPERTY_REST_API_USER = "soap.opportunityapi.to.database.job.api.user";
    private static final String PROPERTY_REST_API_PASSWORD = "soap.opportunityapi.to.database.job.api.password";

    private static final Logger LOGGER = LoggerFactory.getLogger(SOAPOpportunityDBJobConfig.class);
    
     @Bean
    ItemReader<Opportunity> soapOpportunityReader(Environment environment) {
        return new SOAPOpportunityReader(environment.getRequiredProperty(PROPERTY_REST_API_URL),environment.getRequiredProperty(PROPERTY_REST_API_USER),environment.getRequiredProperty(PROPERTY_REST_API_PASSWORD));
    }

    @Bean
    ItemProcessor<Opportunity, Opportunity> soapOpportunityProcessor() {
        return new LoggingOpportunityProcessor();
    }

    @Bean
    ItemWriter<Opportunity> databaseOpportunityWriter(){
    	 return new DatabaseOpportunityWriter();
    }
  
	
	@Bean
    public BatchConfigurer configurer(DataSource batchDataSource){
        return new DefaultBatchConfigurer(batchDataSource);
    }
	
 
    @Bean
    Step soapOpportunityDBStep(ItemReader<Opportunity> soapOpportunityDBReader,
                         ItemProcessor<Opportunity, Opportunity> soapOpportunityDBProcessor,
                         ItemWriter<Opportunity> databaseOpportunityWriter,
                         StepBuilderFactory stepBuilderFactory) {
    	LOGGER.info("Executing soapOpportunityDBStep");
        return stepBuilderFactory.get("soapOpportunityDBStep")
                .<Opportunity, Opportunity>chunk(10)
                .reader(soapOpportunityDBReader)
                .processor(soapOpportunityDBProcessor)
                .writer(databaseOpportunityWriter())
                .build();
    }

    @Bean
    Job soapOpportunityDBJob(JobBuilderFactory jobBuilderFactory,
                       @Qualifier("soapOpportunityDBStep") Step soapOpportunityDBStep) {
        return jobBuilderFactory.get("soapOpportunityDBJob")
                .incrementer(new RunIdIncrementer())
                .flow(soapOpportunityDBStep)
                .end()
                .build();
    }
}
