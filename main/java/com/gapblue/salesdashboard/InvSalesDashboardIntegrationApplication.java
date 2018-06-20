package com.gapblue.salesdashboard;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.context.support.WebApplicationContextUtils;


@SpringBootApplication
@Configuration
@ComponentScan
@EnableBatchProcessing
@EnableScheduling
@PropertySource("classpath:application.properties")
@Import(DataSourceConfig.class)
public class InvSalesDashboardIntegrationApplication extends SpringBootServletInitializer{
	public static ApplicationContext applicationContext ;
	 private static final Logger LOGGER = LoggerFactory.getLogger(InvSalesDashboardIntegrationApplication.class);
	 @Autowired 
	 DataSourceConfig dataSourceConfig;
	 
	 @Autowired
	 Environment environment;
	 
	public static void main(String[] args) {
		SpringApplication.run(InvSalesDashboardIntegrationApplication.class, args);
		
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
	{
		return builder.sources(InvSalesDashboardIntegrationApplication.class);
	}
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		LOGGER.debug("In initialisation.....");
		super.onStartup(servletContext);
		applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
		servletContext.addFilter("openEntityManagerInViewFilter", OpenEntityManagerInViewFilter.class);
		
		
	}
	
	
}
