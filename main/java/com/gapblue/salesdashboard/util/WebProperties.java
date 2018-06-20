package com.gapblue.salesdashboard.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WebProperties {

	private String host;
	private String user;
	private String password;
	
	
	 @Autowired
	   public WebProperties(@Value("${soap.opportunityapi.to.database.job.api.url}") String host,
	                                 @Value("${soap.opportunityapi.to.database.job.api.url}") String user) {
	        this.host = host;
	        this.user = user;
	    //    this.webProperties = webProperties;
	    }
	 
	 
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
