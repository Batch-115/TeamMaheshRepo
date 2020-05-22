package com.webcore.app.easyemi.disbursement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DisbursementDetails {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

private long LoanTransfer_ID;
private Date LoanTransfer_Date;
private Date EMI_StartingDate;
private Date EMI_EndingDate;
public long getLoanTransfer_ID() {
	return LoanTransfer_ID;
}
public void setLoanTransfer_ID(long loanTransfer_ID) {
	LoanTransfer_ID = loanTransfer_ID;
}
public Date getLoanTransfer_Date() {
	return LoanTransfer_Date;
}
public void setLoanTransfer_Date(Date loanTransfer_Date) {
	LoanTransfer_Date = loanTransfer_Date;
}
public Date getEMI_StartingDate() {
	return EMI_StartingDate;
}
public void setEMI_StartingDate(Date eMI_StartingDate) {
	EMI_StartingDate = eMI_StartingDate;
}
public Date getEMI_EndingDate() {
	return EMI_EndingDate;
}
public void setEMI_EndingDate(Date eMI_EndingDate) {
	EMI_EndingDate = eMI_EndingDate;
}
public int getEMI_Pending_Bucket() {
	return EMI_Pending_Bucket;
}
public void setEMI_Pending_Bucket(int eMI_Pending_Bucket) {
	EMI_Pending_Bucket = eMI_Pending_Bucket;
}
public Byte[] getEMI_PendingNoticeDoc() {
	return EMI_PendingNoticeDoc;
}
public void setEMI_PendingNoticeDoc(Byte[] eMI_PendingNoticeDoc) {
	EMI_PendingNoticeDoc = eMI_PendingNoticeDoc;
}
public long getEMI_Notice_ID() {
	return EMI_Notice_ID;
}
public void setEMI_Notice_ID(long eMI_Notice_ID) {
	EMI_Notice_ID = eMI_Notice_ID;
}
public String getLegalNoticeSendStatus() {
	return LegalNoticeSendStatus;
}
public void setLegalNoticeSendStatus(String legalNoticeSendStatus) {
	LegalNoticeSendStatus = legalNoticeSendStatus;
}
public String getLoanTransfer_Status() {
	return LoanTransfer_Status;
}
public void setLoanTransfer_Status(String loanTransfer_Status) {
	LoanTransfer_Status = loanTransfer_Status;
}
public long getLoanDisbursedReceipt_ID() {
	return LoanDisbursedReceipt_ID;
}
public void setLoanDisbursedReceipt_ID(long loanDisbursedReceipt_ID) {
	LoanDisbursedReceipt_ID = loanDisbursedReceipt_ID;
}
public int getEMI_No() {
	return EMI_No;
}
public void setEMI_No(int eMI_No) {
	EMI_No = eMI_No;
}
public double getLoan_PrincipalAmount() {
	return Loan_PrincipalAmount;
}
public void setLoan_PrincipalAmount(double loan_PrincipalAmount) {
	Loan_PrincipalAmount = loan_PrincipalAmount;
}
public double getLoan_InterestAmount() {
	return Loan_InterestAmount;
}
public void setLoan_InterestAmount(double loan_InterestAmount) {
	Loan_InterestAmount = loan_InterestAmount;
}
private int EMI_Pending_Bucket;
private Byte[] EMI_PendingNoticeDoc;
private long EMI_Notice_ID;
private String LegalNoticeSendStatus;
private String LoanTransfer_Status;
private long LoanDisbursedReceipt_ID;
private int EMI_No;
private double Loan_PrincipalAmount;
private double Loan_InterestAmount;
}
