package com.webcore.app.easyemi.disbursement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.disbursement.model.Client;

@Service
public class Mailserver 
{
	private JavaMailSender javaMailSender;
	
	@Autowired
	public Mailserver(JavaMailSender javaMailSender) 
	{
		this.javaMailSender = javaMailSender;
	}

	public void sendEmail(Client user) throws MailException {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(user.getEmailAddress());
		mail.setSubject("Loan Disbursement");
		mail.setText("Dear Sir, Your loan process with EasyEMI is completed and loan is transferred successfully.");
		javaMailSender.send(mail);
	}
}
