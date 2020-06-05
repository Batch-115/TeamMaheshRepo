package com.webcore.app.easyemi.disbursement.controller;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.webcore.app.easyemi.disbursement.model.Client;
import com.webcore.app.easyemi.disbursement.model.Disbursement;
import com.webcore.app.easyemi.disbursement.model.DisbursementDetails;
import com.webcore.app.easyemi.disbursement.service.HomeserviceI;
import com.webcore.app.easyemi.disbursement.service.Mailserver;
import com.webcore.app.easyemi.disbursement.util.GeneratePdfReport;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class Homecontroller 
{
	@Autowired
	HomeserviceI hs;

	@Autowired
	RestTemplate rt;

	List<Disbursement> NewApplications;

//	public void getDataFromOtherModule() {
//		String url = "http://localhost:8083/team2";
//		ResponseEntity<Object[]> response = rt.getForEntity(url, Object[].class);
//		List<Object> l = Arrays.asList(response.getBody());
//
//		String url1 = "http://localhost:8084/team3";
//		ResponseEntity<Object[]> response1 = rt.getForEntity(url1, Object[].class);
//		List<Object> l1 = Arrays.asList(response1.getBody());
//
//		String url2 = "http://localhost:8084/team3";
//		ResponseEntity<Object[]> response2 = rt.getForEntity(url2, Object[].class);
//		List<Object> l2 = Arrays.asList(response2.getBody());
//
//		for (Object o : l) {
//			RequirementDetails r = (RequirementDetails) o; // POJO team2
//			for (Object o1 : l1) {
//				RequirementDetails r1 = (RequirementDetails) o1; // POJO team3
//				if (r.getApplication_ID() == r1.getApplication_ID()) {
//					for (Object o2 : l2) {
//						RequirementDetails r2 = (RequirementDetails) o2; // POJO team2
//						if (r.getApplication_ID() == r2.getApplication_ID()) {
//							Disbursement db = new Disbursement();
//
//							// input from all other module data in our database as per our model class.
//
//							this.NewApplications.add(db);
//						}
//					}
//				}
//			}
//		}
//
//		hs.saveAll(NewApplications);
//	}

	DisbursementDetails disb=new DisbursementDetails();
	long application_ID;

	

	@GetMapping("/new")
	public List<Disbursement> show() {

		return hs.findAll();
	}

	@GetMapping("/new/{id}")
	public Disbursement showIndividualData(@PathVariable("id") long id) {
		return hs.findById(id);
	}

	@PutMapping("/new/{id}")
	public void changeApplStatus(@RequestBody Disbursement db, @PathVariable("id") long id) {
		this.application_ID = id;
		disb.setApplication_ID(id);
		hs.deleteById(id);
		hs.save(db);
	}

	@GetMapping("/transfer/{id}")
	public Disbursement getLoanTransfer(@PathVariable("id") long id) {
		
		String uniqueID = UUID.randomUUID().toString();
		
		disb.setLoanTransfer_ID(uniqueID);
		
		return hs.findById(id);
	}
													
	@GetMapping("/receipt/{id}")
	public Disbursement getReceiptData(@PathVariable("id") long id) {
		
		String uniqueID = UUID.randomUUID().toString();

		disb.setLoanTransferReceipt_ID(uniqueID);

		hs.saveDisbursementData(disb);
		
		return hs.findById(id);
	}

	
	private List<Disbursement> ledger = new ArrayList<Disbursement>();

	@GetMapping("/disb/{id}")
	public List<Disbursement> showLedgerData(@PathVariable("id") long id) {

		Disbursement db = hs.findById(id);

		// Amount
		double balance = db.getPrincipal_amt();
		// Tenure
		float months = db.getEmi_no_total();
		// ROI
		double annualRate = db.getLoan_roi();
		// EMI start date
		Date dt = db.getEmi_start_date();

		// Calculate monthly interest rate
		double monthlyRate = annualRate / 1200;

		double monthlyPayment = db.getEmi_amt();

		for (int i = 1; i <= months; i++) {
			Disbursement db1 = new Disbursement();
			
			db1.setEmi_no(i);
			db1.setEmi_start_date(dt);
			db1.setEmi_amt(monthlyPayment);
			db1.setOs_principal_amt(balance);

			double interest = monthlyRate * balance;
			double principal = monthlyPayment - interest;

			db1.setMonthly_principal(principal);
			db1.setLoan_interest(interest);

			balance = balance - principal;

			Calendar cal = Calendar.getInstance();
			cal.setTime(dt);
			cal.add(Calendar.MONTH, 1);
			dt = cal.getTime();

			ledger.add(db1);

		}
		return ledger;

	}

	@RequestMapping(value = "/ledgerpdf", method = RequestMethod.GET, produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<InputStreamResource> citiesReport() {

		List<Disbursement> cities = ledger;

		ByteArrayInputStream bis = GeneratePdfReport.citiesReport(cities);

		HttpHeaders headers = new HttpHeaders();

		headers.add("Content-Disposition", "inline; filename=RepaymentSchedule.pdf");

		return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF)
				.body(new InputStreamResource(bis));
	}

	@Autowired
	private Mailserver notificationService;

	@Autowired
	private Client user;

	@RequestMapping("/send-mail")
	public String send() {
		user.setEmailAddress("maheshsutar4573@gmail.com"); // Receiver's email address
		try {
			notificationService.sendEmail(user);
		} catch (MailException mailException) {
			System.out.println(mailException);
		}
		return "Congratulations! Your mail has been send to the user." + "to" + user.getEmailAddress();
	}

}