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

import com.gapblue.salesdashboard.processor.LoggingForecastProcessor;
import com.gapblue.salesdashboard.reader.SOAPForecastReader;
import com.gapblue.salesdashboard.writer.DatabaseForecastWriter;
import com.gapblue.web.stubs.salescustomobject.ForecastCustomC;

@Configuration
@EnableBatchProcessing
public class SOAPForecastDBJobConfig {

    private static final String PROPERTY_REST_API_URL = "soap.forecastapi.to.database.job.api.url";
    private static final String PROPERTY_REST_API_USER = "soap.forecastapi.to.database.job.api.user";
    private static final String PROPERTY_REST_API_PASSWORD = "soap.forecastapi.to.database.job.api.password";

    private static final Logger LOGGER = LoggerFactory.getLogger(SOAPForecastDBJobConfig.class);
    
   
     @Bean
     ItemReader<ForecastCustomC> soapForecastReader(Environment environment) {
         return new SOAPForecastReader(environment.getRequiredProperty(PROPERTY_REST_API_URL),environment.getRequiredProperty(PROPERTY_REST_API_USER),environment.getRequiredProperty(PROPERTY_REST_API_PASSWORD));
     }
    @Bean
    ItemProcessor<ForecastCustomC, ForecastCustomC> soapForecastProcessor() {
        return new LoggingForecastProcessor();
    }

    @Bean
    ItemWriter<ForecastCustomC> databaseForecastWriter(){
    	 return new DatabaseForecastWriter();
    }
  
	
	@Bean
    public BatchConfigurer configurer(DataSource batchDataSource){
        return new DefaultBatchConfigurer(batchDataSource);
    }
	
 
    @Bean
    Step soapForecastDBStep(ItemReader<ForecastCustomC> soapForecastReader,
                         ItemProcessor<ForecastCustomC, ForecastCustomC> soapForecastProcessor,
                         ItemWriter<ForecastCustomC> databaseForecastWriter,
                         StepBuilderFactory stepBuilderFactory) {
    	LOGGER.info("Executing soapForecastDBStep");
        return stepBuilderFactory.get("soapForecastDBStep")
                .<ForecastCustomC, ForecastCustomC>chunk(10)
                .reader(soapForecastReader)
                .processor(soapForecastProcessor)
                .writer(databaseForecastWriter())
                .build();
    }
    

    @Bean
    Job soapForecastDBJob(JobBuilderFactory jobBuilderFactory,
                       @Qualifier("soapForecastDBStep") Step soapForecastDBStep) {
        return jobBuilderFactory.get("soapForecastDBJob")
                .incrementer(new RunIdIncrementer())
                .flow(soapForecastDBStep)
                .end()
                .build();
    }
}
