package com.gapblue.salesdashboard;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DataSourceConfig {
	
	  @Primary
		@Bean
		@ConfigurationProperties(prefix="spring.datasource")
		public DataSource batchDatasource()
		{
		  System.out.println("Loading datasource config");
			 return DataSourceBuilder.create().build();
		
		}
		
		@Bean
		@ConfigurationProperties(prefix="second.seconddatasource")
		public DataSource secondaryDataSource()
		{
			System.out.println("Loading secondary datasource");
			  return DataSourceBuilder.create().build();
		}
}
