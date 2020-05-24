package com.webcore.app.easyemi.disbursement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RequirementDetails 
{
	@Id
	@GeneratedValue
	private int requirementDetailID;
	
}
