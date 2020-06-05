package com.webcore.app.easyemi.disbursement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin(origins = "http://localhost:4200")
@SpringBootApplication
@EnableSwagger2
public class LoanDisbursementandLedgerCreationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanDisbursementandLedgerCreationApplication.class, args);
	}

	@Bean
	public RestTemplate rt() 
	{
		return new RestTemplate();
	}
	
}
