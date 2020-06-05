import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators, FormGroup } from '@angular/forms';
import { AhServiceService } from '../ah-service.service';
import { Router } from "@angular/router";

@Component({
  selector: 'app-loan-transfer',
  templateUrl: './loan-transfer.component.html',
  styleUrls: ['./loan-transfer.component.scss']
})
export class LoanTransferComponent implements OnInit {
  registerForm: FormGroup;
    submitted = false;
    date=new Date();
    id:number=null;
    name: String='';
    loan_amt: number=null;
    acc_no: string='';
    ifsc: String='';
    transc_id: String='';
    t_id:String='';

  constructor(private s: AhServiceService, private formBuilder: FormBuilder,
              private router: Router) 
  { 
    
  }


  message:number;

  ngOnInit(): void {
    this.s.currentMessage.subscribe(msg => this.message=msg)

    console.log(this.message);

    this.s.getTranferdata(this.message).subscribe
    ((res) =>
    {
      this.id=res.id;
      this.name=res.name;
      this.loan_amt=res.principal_amt;
      this.acc_no=res.acc_no;
      this.ifsc=res.ifsc;
      //this.t_id=res.transc_id;
    });

  }

  

  onReset() 
  {
    
    this.submitted = false;
    this.registerForm.reset();
  }

  success(){
    this.transc_id=this.t_id;
    sessionStorage.setItem("role", "ah");
    this.router.navigateByUrl("role/ah/loan-receipt");
    }

} 
