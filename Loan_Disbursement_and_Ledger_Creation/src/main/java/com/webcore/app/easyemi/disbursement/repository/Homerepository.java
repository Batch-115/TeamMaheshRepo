package com.webcore.app.easyemi.disbursement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.disbursement.model.DisbursementDetails;

@Repository
public interface Homerepository extends CrudRepository<DisbursementDetails, Long>{

}
