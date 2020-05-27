package com.webcore.app.easyemi.disbursement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.disbursement.model.DisbursementDetails;
import com.webcore.app.easyemi.disbursement.model.RequirementDetails;
import com.webcore.app.easyemi.disbursement.repository.Homerepository;
import com.webcore.app.easyemi.disbursement.repository.Homerepository_1;

@Service
public class Homeservice implements HomeserviceI {
	@Autowired
	Homerepository hr;
	
	@Autowired
	Homerepository_1 hr1;
	
	@Override
	public List getAllApplication_ID() 
	{
		return hr.getIDsforAH_ApprovalStatus();
	}

	@Override
	public List showInProcessApplications(List<Long> approved_IDs) {
		
		return hr1.findAllById(approved_IDs);
	}
	
	@Override
	public List getDefaulterApplication_ID() 
	{
		return hr.getIDsforEMI_Pending_Bucket();
	}

	@Override
	public List showRejectedApplications(List<Long> defaulter_IDs) {
		
		return hr1.findAllById(defaulter_IDs);
	}
	
	public RequirementDetails showSelectedApplicationDetails(long application_ID) 
	{
		return hr1.findById(application_ID).get(); 
	}

	@Override
	public DisbursementDetails getAllData(long application_id) {
		
		return hr.findById(application_id).get();
	}

	@Override
	public RequirementDetails getAllData1(long application_id) {
		
		return hr1.findById(application_id).get();
	}	
	
	
}
