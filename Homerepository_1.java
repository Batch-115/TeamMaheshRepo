package com.webcore.app.easyemi.disbursement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.disbursement.model.DisbursementDetails;
import com.webcore.app.easyemi.disbursement.model.RequirementDetails;

@Repository
public interface Homerepository_1 extends JpaRepository<RequirementDetails, Long>
{
}

