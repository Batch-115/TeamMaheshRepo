package com.webcore.app.easyemi.disbursement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.webcore.app.easyemi.disbursement.model.RequirementDetails;


@Repository
public interface Homerepository_1 extends JpaRepository<RequirementDetails, Long>
{
	
}
