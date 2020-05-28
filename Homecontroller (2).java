package com.webcore.app.easyemi.disbursement.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.webcore.app.easyemi.disbursement.model.DisbursementDetails;
import com.webcore.app.easyemi.disbursement.model.LedgerDetails;
import com.webcore.app.easyemi.disbursement.model.RequirementDetails;
import com.webcore.app.easyemi.disbursement.service.HomeserviceI;


@RestController
@RequestMapping("/api")
public class Homecontroller 
{
	@Autowired
	HomeserviceI hs;

	@Autowired
	RestTemplate rt;
	

//Mahesh_Code
	
	// application ID, applicant name, address, mobile no, policy ID, Loan amount, Loan interest rate,
	// Equipment Name, qty, model no., price, AadharCard_status, PanCard_status, CIBIL Check, AddressProof_status
	List NewApplications; 
	List<Long> approved_IDs, defaulter_IDs;
	DisbursementDetails disb;
	long application_ID;
	
	@GetMapping("/newApplications")
	public List showNewApplications( ) // AH_Approval_status	 
	{ 
		approved_IDs=hs.getAllApplication_ID();
		return NewApplications;
	}
	
	@GetMapping("/inProcessApplications")
	public List showInProcessApplications( ) // AH_Approval_status
	{ 
		defaulter_IDs=hs.getDefaulterApplication_ID();
		return hs.showInProcessApplications(approved_IDs); 
	}

	@GetMapping("/rejectedApplications")
	public List showRejectedApplications( ) // AH_Approval_status
	{ 		
		return hs.showRejectedApplications(defaulter_IDs);
	}
	
	@PostMapping("/showDetailApplication/{id}")
	public RequirementDetails showSelectedApplicationDetails(@PathVariable long application_ID) 
	{
		this.application_ID+=application_ID;
		return hs.showSelectedApplicationDetails(application_ID);
	}
	
	@PostMapping("/getAH_Response/{id}/{AH_status}/{EMI_status}")
	public void save_AH_Response(@PathVariable long application_ID, 
								 @PathVariable String AH_ApprovalStatus, 
								 @PathVariable int EMI_Pending_Bucket) 
	{
		disb.setApplication_ID(application_ID);
		disb.setAH_ApprovalStatus(AH_ApprovalStatus);
		disb.setEMI_Pending_Bucket(EMI_Pending_Bucket);
	}	

//Mahesh_Code

		
}
