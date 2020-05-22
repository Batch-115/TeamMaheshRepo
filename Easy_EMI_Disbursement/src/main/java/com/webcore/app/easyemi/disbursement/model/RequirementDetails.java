package com.webcore.app.easyemi.disbursement.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RequirementDetails {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

private int requirement_ID;
public int getRequirement_ID() {
	return requirement_ID;
}
public void setRequirement_ID(int requirement_ID) {
	this.requirement_ID = requirement_ID;
}
public int getDisbursement_ID() {
	return disbursement_ID;
}
public void setDisbursement_ID(int disbursement_ID) {
	this.disbursement_ID = disbursement_ID;
}
private int disbursement_ID;
private String Ah_Username;
private String Ah_Password;
private String AH_ApprovalStatus;
private String LoanApplicant_Name;
private String LoanApplicant_address;
private String LoanApplicant_MobileNo;
private int LoanTransfer_BankAccountNo;
private String LoanTransfer_IFSCcode;
private int LoanApplication_ID;
private int LoanPolicy_ID;
private long LoanAmount;
private long Loan_ROI;
private long Loan_EMIAmount;
public String getAh_Username() {
	return Ah_Username;
}
public void setAh_Username(String ah_Username) {
	Ah_Username = ah_Username;
}
public String getAh_Password() {
	return Ah_Password;
}
public void setAh_Password(String ah_Password) {
	Ah_Password = ah_Password;
}
public String getAH_ApprovalStatus() {
	return AH_ApprovalStatus;
}
public void setAH_ApprovalStatus(String aH_ApprovalStatus) {
	AH_ApprovalStatus = aH_ApprovalStatus;
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
public int getLoanTransfer_BankAccountNo() {
	return LoanTransfer_BankAccountNo;
}
public void setLoanTransfer_BankAccountNo(int loanTransfer_BankAccountNo) {
	LoanTransfer_BankAccountNo = loanTransfer_BankAccountNo;
}
public String getLoanTransfer_IFSCcode() {
	return LoanTransfer_IFSCcode;
}
public void setLoanTransfer_IFSCcode(String loanTransfer_IFSCcode) {
	LoanTransfer_IFSCcode = loanTransfer_IFSCcode;
}
public int getLoanApplication_ID() {
	return LoanApplication_ID;
}
public void setLoanApplication_ID(int loanApplication_ID) {
	LoanApplication_ID = loanApplication_ID;
}
public int getLoanPolicy_ID() {
	return LoanPolicy_ID;
}
public void setLoanPolicy_ID(int loanPolicy_ID) {
	LoanPolicy_ID = loanPolicy_ID;
}
public long getLoanAmount() {
	return LoanAmount;
}
public void setLoanAmount(long loanAmount) {
	LoanAmount = loanAmount;
}
public long getLoan_ROI() {
	return Loan_ROI;
}
public void setLoan_ROI(long loan_ROI) {
	Loan_ROI = loan_ROI;
}
public long getLoan_EMIAmount() {
	return Loan_EMIAmount;
}
public void setLoan_EMIAmount(long loan_EMIAmount) {
	Loan_EMIAmount = loan_EMIAmount;
}
}
