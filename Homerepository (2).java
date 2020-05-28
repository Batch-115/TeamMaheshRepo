package com.webcore.app.easyemi.disbursement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.disbursement.model.DisbursementDetails;

@Repository
public interface Homerepository extends JpaRepository<DisbursementDetails, Long>
{
	@Query("SELECT Application_ID FROM DisbursementDetails WHERE AH_ApprovalStatus = 'Approved'")
    public List getIDsforAH_ApprovalStatus();

	
	
	@Query("SELECT Application_ID FROM DisbursementDetails WHERE EMI_Pending_Bucket <> 0")
	public List getIDsforEMI_Pending_Bucket();

}
