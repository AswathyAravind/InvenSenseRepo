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

import com.gapblue.salesdashboard.processor.LoggingQuotelineProcessor;
import com.gapblue.salesdashboard.reader.SOAPQuotelineReader;
import com.gapblue.salesdashboard.writer.DatabaseQuotelineWriter;
import com.gapblue.web.stubs.salescustomobject.QuoteLineItemC;

@Configuration
@EnableBatchProcessing
public class SOAPQuotelineDBJobConfig {

    private static final String PROPERTY_REST_API_URL = "soap.quotelineapi.to.database.job.api.url";
    private static final String PROPERTY_REST_API_USER = "soap.quotelineapi.to.database.job.api.user";
    private static final String PROPERTY_REST_API_PASSWORD = "soap.quotelineapi.to.database.job.api.password";

    private static final Logger LOGGER = LoggerFactory.getLogger(SOAPQuotelineDBJobConfig.class);
    
     @Bean
    ItemReader<QuoteLineItemC> soapQuotelineReader(Environment environment) {
        return new SOAPQuotelineReader(environment.getRequiredProperty(PROPERTY_REST_API_URL),environment.getRequiredProperty(PROPERTY_REST_API_USER),environment.getRequiredProperty(PROPERTY_REST_API_PASSWORD));
    }

    @Bean
    ItemProcessor<QuoteLineItemC, QuoteLineItemC> soapQuotelineProcessor() {
        return new LoggingQuotelineProcessor();
    }

    @Bean
    ItemWriter<QuoteLineItemC> databaseQuotelineWriter(){
    	 return new DatabaseQuotelineWriter();
    }
  
	
	@Bean
    public BatchConfigurer configurer(DataSource batchDataSource){
        return new DefaultBatchConfigurer(batchDataSource);
    }
	
 
    @Bean
    Step soapQuotelineDBStep(ItemReader<QuoteLineItemC> soapQuotelineDBReader,
                         ItemProcessor<QuoteLineItemC, QuoteLineItemC> soapQuotelineDBProcessor,
                         ItemWriter<QuoteLineItemC> databaseQuotelineWriter,
                         StepBuilderFactory stepBuilderFactory) {
    	LOGGER.info("Executing soapQuotelineDBStep");
        return stepBuilderFactory.get("soapQuotelineDBStep")
                .<QuoteLineItemC, QuoteLineItemC>chunk(10)
                .reader(soapQuotelineDBReader)
                .processor(soapQuotelineDBProcessor)
                .writer(databaseQuotelineWriter())
                .build();
    }

    @Bean
    Job soapQuotelineDBJob(JobBuilderFactory jobBuilderFactory,
                       @Qualifier("soapQuotelineDBStep") Step soapQuotelineDBStep) {
        return jobBuilderFactory.get("soapQuotelineDBJob")
                .incrementer(new RunIdIncrementer())
                .flow(soapQuotelineDBStep)
                .end()
                .build();
    }
}
