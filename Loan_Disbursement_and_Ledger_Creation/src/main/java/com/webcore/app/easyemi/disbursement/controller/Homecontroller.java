package com.webcore.app.easyemi.disbursement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.webcore.app.easyemi.disbursement.service.HomeserviceI;

@Controller
public class Homecontroller 
{
	@Autowired
	HomeserviceI hs;
}
