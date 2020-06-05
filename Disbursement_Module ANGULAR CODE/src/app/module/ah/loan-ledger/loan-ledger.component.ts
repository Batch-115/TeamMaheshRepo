import { Component, OnInit } from '@angular/core';
import { AhServiceService } from '../ah-service.service';
import { Router } from "@angular/router";
import { Disbursement } from '../Disbursement';

@Component({
  selector: 'app-loan-ledger',
  templateUrl: './loan-ledger.component.html',
  styleUrls: ['./loan-ledger.component.scss']
})
export class LoanLedgerComponent implements OnInit {

  ledger: Disbursement[];
  message:number;
  
  constructor(private s:AhServiceService, private router: Router) { }

  column = ["EMI No.", "EMI DUE DATE", "EMI AMOUNT", "MONTHLY PRINCIPAL", "MONTHLY INTEREST", "O/s PRINCIPAL"];

  index = ["emi_no","emi_start_date", "emi_amt", "monthly_principal", "loan_interest", "Os_principal_amt"];

  principal_amt:number;
  name:string;


  ngOnInit() {

    this.s.currentMessage.subscribe(msg => this.message=msg);

    this.s.getLedgerdata(this.message).subscribe
    (
      (response)=> 
    {
      this.ledger=response;
      
    },
    (error) => console.log(error)
    );
  
  }


  status:string;
  d:Disbursement;

  success(){

    this.s.getReceiptdata(this.message).subscribe(
      (res) => {
        this.d=res;
      }
    );

    this.status="Completed";
    this.d.application_status=this.status;
    this.s.changeAppl_status(this.d).subscribe
    (
      (res) =>
      {

      }
    );
   

    window.open("http://localhost:8085/api/ledgerpdf");
    sessionStorage.setItem("role", "ah");
    this.router.navigateByUrl("role/ah/ahdashboard");
    }

}
