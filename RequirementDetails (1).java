package com.webcore.app.easyemi.disbursement.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RequirementDetails 
{
	@Id
	private long Application_ID;
	private String  LoanApplicant_Name, 
					LoanApplicant_address,
					LoanApplicant_MobileNo, 
					LoanTransfer_BankAccountNo, 
					LoanTransfer_IFSCcode,
					loanSanction_Status, 
					adhaarCardVerify_Status, 
					panCardVerify_Status, 
					addressProofVerify_Status;
	
	private long LoanPolicy_ID;
	
	private double LoanAmount, 
				   Loan_EMIAmount;
	
	private int Loan_ROI;
	
	
	public long getApplication_ID() {
		return Application_ID;
	}

	public void setApplication_ID(long loanApplication_ID) {
		Application_ID = loanApplication_ID;
	}

	public String getLoanApplicant_Name() {
		return LoanApplicant_Name;
	}

	public void setLoanApplicant_Name(String loanApplicant_Name) {
		LoanApplicant_Name = loanApplicant_Name;
	}

	public String getLoanApplicant_address() {
		return LoanApplicant_address;
	}

	public void setLoanApplicant_address(String loanApplicant_address) {
		LoanApplicant_address = loanApplicant_address;
	}

	public String getLoanApplicant_MobileNo() {
		return LoanApplicant_MobileNo;
	}

	public void setLoanApplicant_MobileNo(String loanApplicant_MobileNo) {
		LoanApplicant_MobileNo = loanApplicant_MobileNo;
	}

	public String getLoanTransfer_BankAccountNo() {
		return LoanTransfer_BankAccountNo;
	}

	public void setLoanTransfer_BankAccountNo(String loanTransfer_BankAccountNo) {
		LoanTransfer_BankAccountNo = loanTransfer_BankAccountNo;
	}

	public String getLoanTransfer_IFSCcode() {
		return LoanTransfer_IFSCcode;
	}

	public void setLoanTransfer_IFSCcode(String loanTransfer_IFSCcode) {
		LoanTransfer_IFSCcode = loanTransfer_IFSCcode;
	}

	public String getLoanSanction_Status() {
		return loanSanction_Status;
	}

	public void setLoanSanction_Status(String loanSanction_Status) {
		this.loanSanction_Status = loanSanction_Status;
	}

	public String getAdhaarCardVerify_Status() {
		return adhaarCardVerify_Status;
	}

	public void setAdhaarCardVerify_Status(String adhaarCardVerify_Status) {
		this.adhaarCardVerify_Status = adhaarCardVerify_Status;
	}

	public String getPanCardVerify_Status() {
		return panCardVerify_Status;
	}

	public void setPanCardVerify_Status(String panCardVerify_Status) {
		this.panCardVerify_Status = panCardVerify_Status;
	}

	public String getAddressProofVerify_Status() {
		return addressProofVerify_Status;
	}

	public void setAddressProofVerify_Status(String addressProofVerify_Status) {
		this.addressProofVerify_Status = addressProofVerify_Status;
	}

	public long getLoanPolicy_ID() {
		return LoanPolicy_ID;
	}

	public void setLoanPolicy_ID(long loanPolicy_ID) {
		LoanPolicy_ID = loanPolicy_ID;
	}

	public double getLoanAmount() {
		return LoanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		LoanAmount = loanAmount;
	}

	public double getLoan_EMIAmount() {
		return Loan_EMIAmount;
	}

	public void setLoan_EMIAmount(double loan_EMIAmount) {
		Loan_EMIAmount = loan_EMIAmount;
	}

	public int getLoan_ROI() {
		return Loan_ROI;
	}

	public void setLoan_ROI(int loan_ROI) {
		Loan_ROI = loan_ROI;
	}
	
	
	
}
