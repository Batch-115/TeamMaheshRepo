package com.webcore.app.easyemi.disbursement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.disbursement.model.DisbursementDetails;

@Repository
public interface Homerepository extends JpaRepository<DisbursementDetails, Long>
{
	

}
