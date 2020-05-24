package com.webcore.app.easyemi.disbursement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.disbursement.repository.Homerepository;

@Service
public class Homeservice implements HomeserviceI 
{
	@Autowired
	Homerepository hd;
}
