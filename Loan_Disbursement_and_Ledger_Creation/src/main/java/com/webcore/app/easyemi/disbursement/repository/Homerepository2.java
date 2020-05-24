package com.webcore.app.easyemi.disbursement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.disbursement.model.RequirementDetails;

@Repository
public interface Homerepository2 extends CrudRepository<RequirementDetails, Integer>{

}
