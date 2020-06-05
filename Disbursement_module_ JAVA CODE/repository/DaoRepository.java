package com.webcore.app.easyemi.disbursement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.easyemi.disbursement.model.Disbursement;

@Repository
public interface DaoRepository extends JpaRepository<Disbursement, Long>
{

}
