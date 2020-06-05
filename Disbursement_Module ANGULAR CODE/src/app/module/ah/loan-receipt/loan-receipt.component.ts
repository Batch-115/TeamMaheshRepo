import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { AhServiceService } from '../ah-service.service';
import { LoanReceipt } from '../Receipt';
import { Router } from "@angular/router";
import { Disbursement } from '../Disbursement';

@Component({
  selector: 'app-loan-receipt',
  templateUrl: './loan-receipt.component.html',
  styleUrls: ['./loan-receipt.component.scss']
})
export class LoanReceiptComponent implements OnInit {
  registerForm: FormGroup;
  submitted = false;
  
  id:number=null;
  date=new Date();
  recpt_no:number=null;
  address:string='';
  name:string='';
  loan_amt:number=null;
  emi_amt:number=null;
  total_emi:number=null;
  emi_date:Date=null;

  constructor(private s: AhServiceService, private formBuilder: FormBuilder,
              private router: Router) {
    
   }

  column = ["APPLICATION ID", "PRINCIPAL AMOUNT", "EMI AMOUNT", "TOTAL EMI", "EMI START DATE"];

  index = ["id","principal_amt", "emi_amt", "emi_no_total", "emi_start_date"];

  ledger:Disbursement;
  
  message:number;

  ngOnInit() {
    this.s.currentMessage.subscribe(msg => this.message=msg)

    this.s.getReceiptdata(this.message).subscribe
    (
      (response)=> 
    {
      this.ledger=response
      this.id=this.ledger.id;
      this.name=this.ledger.name;
      this.address=this.ledger.addr;
      this.loan_amt=this.ledger.principal_amt;
      this.emi_amt=this.ledger.emi_amt;
      this.total_emi=this.ledger.emi_no_total;
      this.emi_date=this.ledger.emi_start_date;
    },
    (error) => console.log(error)
    );
  }

  
    success(){
      window.open("http://localhost:8085/api/send-mail");
      sessionStorage.setItem("role", "ah");
      this.router.navigateByUrl("role/ah/loan-ledger");
      }

}
