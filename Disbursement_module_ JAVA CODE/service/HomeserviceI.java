package com.webcore.app.easyemi.disbursement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.disbursement.model.Disbursement;
import com.webcore.app.easyemi.disbursement.model.DisbursementDetails;

@Service
public interface HomeserviceI 
{

	void saveAll(List<Disbursement> newApplications);

	List<Disbursement> findAll();

	Disbursement findById(long id);

	void deleteById(long id);

	void save(Disbursement db);

	void saveDisbursementData(DisbursementDetails disb);
	
}
