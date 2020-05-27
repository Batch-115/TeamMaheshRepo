package com.webcore.app.easyemi.disbursement.service;

import java.util.List;

import com.webcore.app.easyemi.disbursement.model.DisbursementDetails;
import com.webcore.app.easyemi.disbursement.model.RequirementDetails;

public interface HomeserviceI {
public List getAllApplication_ID();
	
	public List showInProcessApplications(List<Long> approved_IDs);
	
	public List getDefaulterApplication_ID();
	
	public List showRejectedApplications(List<Long> defaulter_IDs);
	
	public RequirementDetails showSelectedApplicationDetails(long application_ID);
	
	public DisbursementDetails getAllData(long application_id);

	public RequirementDetails getAllData1(long application_id);
}
