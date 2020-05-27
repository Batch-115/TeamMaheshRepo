package com.webcore.app.easyemi.disbursement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DisbursementDetails {
	@Id
	private long Application_ID;
	private String AH_ApprovalStatus;
	private long LoanTransfer_ID; 
	private Date LoanTransfer_Date;
	private Date EMI_StartingDate;
	private Date EMI_EndingDate;
	private int EMI_Pending_Bucket;
	private byte[] EMI_PendingNoticeDoc;
	private byte[] LegalNoticeSend, ledgerCreated;
	private String LoanTransfer_Status;
	private long LoanTransferReceipt_ID;
	private int EMI_No;
	private double Loan_PrincipalAmount;
	private double Loan_InterestAmount;
	private String App_approved_status;
	private String registration_status;
	
	public String getApp_approved_status() {
		return App_approved_status;
	}
	public void setApp_approved_status(String app_approved_status) {
		App_approved_status = app_approved_status;
	}
	public String getRegistration_status() {
		return registration_status;
	}
	public void setRegistration_status(String registration_status) {
		this.registration_status = registration_status;
	}
	private String application_Status;
	 public byte[] getLedgerCreated() {
		return ledgerCreated;
	}
	public void setLedgerCreated(byte[] ledgerCreated) {
		this.ledgerCreated = ledgerCreated;
	}
	public String getApplication_Status() {
		return application_Status;
	}
	public void setApplication_Status(String application_Status) {
		this.application_Status = application_Status;
	}
	public String getAction_Taken() {
		return action_Taken;
	}
	public void setAction_Taken(String action_Taken) {
		this.action_Taken = action_Taken;
	}
	private String action_Taken;
	
	public long getApplication_ID() {
		return Application_ID;
	}
	public void setApplication_ID(long application_ID) {
		Application_ID = application_ID;
	}
	public String getAH_ApprovalStatus() {
		return AH_ApprovalStatus;
	}
	public void setAH_ApprovalStatus(String aH_ApprovalStatus) {
		AH_ApprovalStatus = aH_ApprovalStatus;
	}
	
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
	public byte[] getEMI_PendingNoticeDoc() {
		return EMI_PendingNoticeDoc;
	}
	public void setEMI_PendingNoticeDoc(byte[] eMI_PendingNoticeDoc) {
		EMI_PendingNoticeDoc = eMI_PendingNoticeDoc;
	}
	public byte[] getLegalNoticeSend() {
		return LegalNoticeSend;
	}
	public void setLegalNoticeSend(byte[] legalNoticeSend) {
		LegalNoticeSend = legalNoticeSend;
	}
	public String getLoanTransfer_Status() {
		return LoanTransfer_Status;
	}
	public void setLoanTransfer_Status(String loanTransfer_Status) {
		LoanTransfer_Status = loanTransfer_Status;
	}
	public long getLoanTransferReceipt_ID() {
		return LoanTransferReceipt_ID;
	}
	public void setLoanTransferReceipt_ID(long loanTransferReceipt_ID) {
		LoanTransferReceipt_ID = loanTransferReceipt_ID;
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
}