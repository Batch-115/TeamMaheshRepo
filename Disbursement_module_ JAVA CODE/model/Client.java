package com.webcore.app.easyemi.disbursement.model;

import org.springframework.stereotype.Component;

@Component
public class Client 
{
	private String emailAddress;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
