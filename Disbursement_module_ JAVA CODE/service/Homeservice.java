package com.webcore.app.easyemi.disbursement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.easyemi.disbursement.model.Disbursement;
import com.webcore.app.easyemi.disbursement.model.DisbursementDetails;
import com.webcore.app.easyemi.disbursement.repository.DaoRepository;
import com.webcore.app.easyemi.disbursement.repository.Homerepository;

@Service
public class Homeservice  implements HomeserviceI
{
	@Autowired
	Homerepository hr;
	
	@Autowired
	DaoRepository dao;

	@Override
	public void saveAll(List<Disbursement> newApplications) {
		
		dao.saveAll(newApplications);		
	}

	@Override
	public List<Disbursement> findAll() {

		return dao.findAll();
	}

	@Override
	public Disbursement findById(long id) {

		return dao.findById(id).get();
	}

	@Override
	public void deleteById(long id) {
		dao.deleteById(id);
		
	}

	@Override
	public void save(Disbursement db) {

		dao.save(db);
	}

	@Override
	public void saveDisbursementData(DisbursementDetails disb) {

		hr.save(disb);
		
	}
	
		
}
