package com.webcore.app.easyemi.disbursement.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DisbursementDetails 
{
	@Id
	private long Application_ID;

	private String LoanTransfer_ID;

	private String LoanTransferReceipt_ID;

	@Override
	public String toString() {
		return "DisbursementDetails [Application_ID=" + Application_ID + ", LoanTransfer_ID=" + LoanTransfer_ID
				+ ", LoanTransferReceipt_ID=" + LoanTransferReceipt_ID + "]";
	}

	public long getApplication_ID() {
		return Application_ID;
	}

	public void setApplication_ID(long application_ID) {
		Application_ID = application_ID;
	}

	public String getLoanTransfer_ID() {
		return LoanTransfer_ID;
	}

	public void setLoanTransfer_ID(String loanTransfer_ID) {
		LoanTransfer_ID = loanTransfer_ID;
	}

	public String getLoanTransferReceipt_ID() {
		return LoanTransferReceipt_ID;
	}

	public void setLoanTransferReceipt_ID(String loanTransferReceipt_ID) {
		LoanTransferReceipt_ID = loanTransferReceipt_ID;
	}
	
}