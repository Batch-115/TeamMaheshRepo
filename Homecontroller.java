 package com.webcore.app.easyemi.disbursement.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.easyemi.disbursement.model.DisbursementDetails;
import com.webcore.app.easyemi.disbursement.model.LedgerDetails;
import com.webcore.app.easyemi.disbursement.model.RequirementDetails;
import com.webcore.app.easyemi.disbursement.service.HomeserviceI;

//long LoanApplication_ID;
//long loanPolicy_ID
//String LoanApplicant_Name;
//String LoanApplicant_Address;
//String LoanApplicant_MobileNo;
//double loan_pending_Amount;
//double loan_Principal_Amount;
//double loan_Interest_rate;
//String equipement_Name;
//String equipment_ModelNo;
//double equipment_price;
//int equipment_qty;
//double emi_Paid;
//Date emi_Start_Date;
//Date emi_End_Date;
//double outstanding_Loan_Amount;
//String application_Status;
//String action_Taken;


//@RequestMapping("/disbursement")
@RestController
public class Homecontroller 
{
	@Autowired
	HomeserviceI hs;

//Common_Code
	private String  LoanApplicant_Name, LoanApplicant_address,LoanApplicant_MobileNo, 
	LoanTransfer_BankAccountNo, LoanTransfer_IFSCcode,
	loanSanction_Status, adhaarCardVerify_Status, panCardVerify_Status, addressProofVerify_Status;
	
	private long LoanApplication_ID, LoanPolicy_ID;
	
	private double LoanAmount, Loan_EMIAmount;
	
	private int Loan_ROI;
	private float Loan_Tenure;

//Common_Code
	
	
//Mahesh_Code
	
	// application ID, applicant name, address, mobile no, policy ID, Loan amount, Loan interest rate,
	// Equipment Name, qty, model no., price, AadharCard_status, PanCard_status, CIBIL Check, AddressProof_status
	List NewApplications; 
	List<Long> approved_IDs, 
	defaulter_IDs;
	DisbursementDetails disb;
	long application_ID;
	
	@GetMapping("/newApplications")
	public List showNewApplications( ) // AH_Approval_status	 
	{ 
		approved_IDs=hs.getAllApplication_ID();
		return NewApplications;
	}
	
	@GetMapping("/inProcessApplications")
	public List showInProcessApplications( ) // AH_Approval_status
	{ 
		defaulter_IDs=hs.getDefaulterApplication_ID();
		return hs.showInProcessApplications(approved_IDs); 
	}

	@GetMapping("/rejectedApplications")
	public List showRejectedApplications( ) // AH_Approval_status
	{ 		
		return hs.showRejectedApplications(defaulter_IDs);
	}
	
	@PostMapping("/showDetailApplication/{id}")
	public RequirementDetails showSelectedApplicationDetails(@PathVariable long application_ID) 
	{
		this.application_ID+=application_ID;
		return hs.showSelectedApplicationDetails(application_ID);
	}
	
	@PostMapping("/getAH_Response/{id}/{AH_status}/{EMI_status}")
	public void save_AH_Response(@PathVariable long application_ID, 
								 @PathVariable String AH_ApprovalStatus, 
								 @PathVariable int EMI_Pending_Bucket) 
	{
		disb.setApplication_ID(application_ID);
		disb.setAH_ApprovalStatus(AH_ApprovalStatus);
		disb.setEMI_Pending_Bucket(EMI_Pending_Bucket);
	}	

//Mahesh_Code

	//Sonal_Code
	
	public Date date;
	
	//Sonal_Code
	
	//Anuja_Code
	
	
	//Anuja_Code
	
	//Manoj_Code
	private List ledger=null;
	
	
	public List showLedgerDetails()
	{
		 //Amount
		double loanAmount = LoanAmount;
		 //Tenure 
		float years = Loan_Tenure;
		 //ROI
		double annualRate = Loan_ROI;

		// Calculate monthly interest rate
		double monthlyRate = annualRate / 1200; 
		
		//Calculate monthly payment
		double monthlyPayment = loanAmount * monthlyRate / (1 - 1 /Math.pow(1 + monthlyRate, years * 12));  
		
		System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);  		// Display monthly payment

		System.out.printf("Total Payment: %.2f\n", (monthlyPayment * 12) * years); 		// Display total payment

		//logic to generate  EMI_no Loan _PrincipalAmount,Loan _interestAmount,outstanding balance
				double balance = loanAmount, principal, interest;                         
				//System.out.println("EMI NO  Interest_Amt  Principal_Amt  O/s Principal_Amt");  
				double EMI_Amt = monthlyPayment;
				
				for (int i = 1; i <= years * 12; i++)
				{
					LedgerDetails ld=new LedgerDetails();
					interest = monthlyRate * balance;
					principal = monthlyPayment - interest;
					balance = balance - principal; 
					date=date;
					ld.setInterest(interest);
					ld.setPrincipal(principal);   
					ld.setBalance(balance);
					ld.setEMI_amount(Loan_EMIAmount);
					ld.setDate(date);
					ld.setEMI_no(i);
					
					ledger.add(ld);
					
					//System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, interest,principal, balance);
					
				}
				
				return ledger;
			

	}
	
	//Manoj_Code
	
	//Shrutee_Code
	
	@PostMapping(value = "/api/{application_Id}")
	public DisbursementDetails getAllData(@PathVariable ("application_Id") long application_id){
		
		DisbursementDetails dd = hs.getAllData(application_id);
		
 if(dd.getRegistration_status().equals("Approved") && dd.getApp_approved_status().equals("Disapproved") 
		 && dd.getAH_ApprovalStatus().equals("Disapproved")) {
	 
			dd.setApplication_Status("New");
			dd.setAction_Taken("Registred");
		}
 else if (dd.getApp_approved_status().equals("Approved") 
		 && dd.getAH_ApprovalStatus().equals("Disapproved")) {
	    dd.setApplication_Status("NEW");
		dd.setAction_Taken("Verification");
}	
 else if(dd.getAH_ApprovalStatus().equals("Approved") ) {
	 dd.setApplication_Status("In process");
		dd.setAction_Taken("On-Going");
}
 else {
	 if(dd.getEMI_Pending_Bucket()==1) {
		 dd.setApplication_Status("Defaulter");
			dd.setAction_Taken("1st Notice Send");
	 }
	 else if(dd.getEMI_Pending_Bucket()==2) {
		 dd.setApplication_Status("Defaulter");
			dd.setAction_Taken("2nd Notice Send");
	 }
	 else {
		 dd.setApplication_Status("Defaulter");
			dd.setAction_Taken("Legal Action taken (repossession)");
	}
 }
		return dd;
		
		   
	}
	
	@PostMapping(value = "/api1/{application_Id}")
	public RequirementDetails getAllData1(@PathVariable ("application_Id") long application_id){
		
		
		
		return hs.getAllData1(application_id) ;
		
			
		}
	//Shrutee_Code
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
