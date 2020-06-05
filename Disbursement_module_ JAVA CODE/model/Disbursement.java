package com.webcore.app.easyemi.disbursement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Disbursement 
{
	@Id
	private long id;
	private Date date;
	private String name, addr;
	private long contact;
	private double principal_amt, emi_amt,loan_roi;
	private String equip_name, equip_model_no;
	private double equip_price;
	private int emi_no_paid, emi_no_total;
	private Date emi_start_date, emi_end_date;
	private double Os_principal_amt;
	private String doc_verify_status, application_status, action_taken;
	
	private String acc_no, ifsc;
	
	private double  loan_interest, monthly_principal;
	
	private int emi_no;
	
	
	public double getMonthly_principal() {
		return monthly_principal;
	}

	public void setMonthly_principal(double monthly_principal) {
		this.monthly_principal = monthly_principal;
	}

	
	public int getEmi_no() {
		return emi_no;
	}

	public void setEmi_no(int emi_no) {
		this.emi_no = emi_no;
	}

	public double getLoan_interest() {
		return loan_interest;
	}

	public void setLoan_interest(double loan_interest) {
		this.loan_interest = loan_interest;
	}

	public String getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(String acc_no) {
		this.acc_no = acc_no;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public Disbursement() 
	{
	
	}

	public Disbursement(long id, Date date, String name, String addr, long contact, double principal_amt,
			double emi_amt, double loan_roi, String equip_name, String equip_model_no, double equip_price,
			int emi_no_paid, int emi_no_total, Date emi_start_date, Date emi_end_date, double os_principal_amt,
			String doc_verify_status, String application_status, String action_taken) 
	{
	
		this.id = id;
		this.date = date;
		this.name = name;
		this.addr = addr;
		this.contact = contact;
		this.principal_amt = principal_amt;
		this.emi_amt = emi_amt;
		this.loan_roi = loan_roi;
		this.equip_name = equip_name;
		this.equip_model_no = equip_model_no;
		this.equip_price = equip_price;
		this.emi_no_paid = emi_no_paid;
		this.emi_no_total = emi_no_total;
		this.emi_start_date = emi_start_date;
		this.emi_end_date = emi_end_date;
		Os_principal_amt = os_principal_amt;
		this.doc_verify_status = doc_verify_status;
		this.application_status = application_status;
		this.action_taken = action_taken;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public double getPrincipal_amt() {
		return principal_amt;
	}

	public void setPrincipal_amt(double principal_amt) {
		this.principal_amt = principal_amt;
	}

	public double getEmi_amt() {
		return emi_amt;
	}

	public void setEmi_amt(double emi_amt) {
		this.emi_amt = emi_amt;
	}

	public double getLoan_roi() {
		return loan_roi;
	}

	public void setLoan_roi(double loan_roi) {
		this.loan_roi = loan_roi;
	}

	public String getEquip_name() {
		return equip_name;
	}

	public void setEquip_name(String equip_name) {
		this.equip_name = equip_name;
	}

	public String getEquip_model_no() {
		return equip_model_no;
	}

	public void setEquip_model_no(String equip_model_no) {
		this.equip_model_no = equip_model_no;
	}

	public double getEquip_price() {
		return equip_price;
	}

	public void setEquip_price(double equip_price) {
		this.equip_price = equip_price;
	}

	public int getEmi_no_paid() {
		return emi_no_paid;
	}

	public void setEmi_no_paid(int emi_no_paid) {
		this.emi_no_paid = emi_no_paid;
	}

	public int getEmi_no_total() {
		return emi_no_total;
	}

	public void setEmi_no_total(int emi_no_total) {
		this.emi_no_total = emi_no_total;
	}

	public Date getEmi_start_date() {
		return emi_start_date;
	}

	public void setEmi_start_date(Date emi_start_date) {
		this.emi_start_date = emi_start_date;
	}

	public Date getEmi_end_date() {
		return emi_end_date;
	}

	public void setEmi_end_date(Date emi_end_date) {
		this.emi_end_date = emi_end_date;
	}

	public double getOs_principal_amt() {
		return Os_principal_amt;
	}

	public void setOs_principal_amt(double os_principal_amt) {
		Os_principal_amt = os_principal_amt;
	}

	public String getDoc_verify_status() {
		return doc_verify_status;
	}

	public void setDoc_verify_status(String doc_verify_status) {
		this.doc_verify_status = doc_verify_status;
	}

	public String getApplication_status() {
		return application_status;
	}

	public void setApplication_status(String application_status) {
		this.application_status = application_status;
	}

	public String getAction_taken() {
		return action_taken;
	}

	public void setAction_taken(String action_taken) {
		this.action_taken = action_taken;
	}
	
	@Override
    public String toString() {

    	StringBuilder builder = new StringBuilder();
        builder.append(emi_no).append(emi_start_date).append(emi_amt)
                .append(monthly_principal).append(loan_interest)
                .append(Os_principal_amt);

        return builder.toString();
    }
}
