import { Component, OnInit, TemplateRef } from '@angular/core';
import { AhServiceService } from '../ah-service.service';
import { Disbursement } from '../Disbursement';
import { BsModalService, BsModalRef } from 'ngx-bootstrap/modal'; 
import { Router } from "@angular/router";
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-ahdashboard',
  templateUrl: './ahdashboard.component.html',
  styleUrls: ['./ahdashboard.component.scss']
})
export class AhdashboardComponent implements OnInit {
  modalRef: BsModalRef; 
  
    id:number= null;
    date=new Date();
    name:string= '';
    addr:string= '';
    contact:number= null;
    principal_amt:number= null;
    loan_roi:number= null;
    emi_amt:number= null;
    equip_name:string= '';
    equip_model_no:string= '';
    equip_price:number= null;
    emi_no_paid:number= null;
    emi_no_total:number= null;
    emi_start_date:Date= null;
    emi_end_date:Date= null;
    Os_principal_amt:number= null;

    doc_verify_status:string= '';

    application_status:string= '';
    action_taken:string= '';



    message:number;

  constructor(private s:AhServiceService, private modalService: BsModalService,
              private router: Router, private formBuilder: FormBuilder) {
             }


  new_appl:number=0;
  Inprocess_appl:number=0;
  defaulter_appl:number=0;
  data: Disbursement;

  column = ["APPLICATION ID", "APPLICANT NAME", "PRINCIPAL Amount"];

  index = ["id","name", "principal_amt"];

  ledger:Disbursement[]=[];
  new_ledger:Disbursement[]=[];
  Inprocess_ledger:Disbursement[]=[];
  defaulter_ledger:Disbursement[]=[];

  

  showData:boolean=false;

  showListNew(){
    this.showData=true;
    this.ledger=this.new_ledger;
    
  }

  showListInprocess(){
    this.showData=true;
    this.ledger=this.Inprocess_ledger;
  }

  showListDefaulter(){
    this.showData=true;
    this.ledger=this.defaulter_ledger;
  }


  ngOnInit() {

    this.s.getAlldata().subscribe
    (
      (response)=> 
    {
      this.ledger=response
      
      this.ledger.forEach(element => {
        if (element.application_status==="New") 
        {
          this.new_appl=this.new_appl+1;
          this.new_ledger.push(element);
        }else if(element.application_status==="InProcess")
        {
          this.Inprocess_appl=this.Inprocess_appl+1;
          this.Inprocess_ledger.push(element);
        }else if(element.application_status==="Defaulter")
        {
          this.defaulter_appl=this.defaulter_appl+1;
          this.defaulter_ledger.push(element);
        }
      
      });
    },
    (error) => console.log(error)
    );    
    

  }


  selected_id(ld:Disbursement)
  {
    console.log(ld.id);

    this.s.getDisbById(ld.id).subscribe
    (
      (response:Disbursement)=> 
    {
      this.data=response;
      console.log(this.data.id);
      this.id=this.data.id;
     // this.date = this.data.date;
      this.name= this.data.name,
      this.addr= this.data.addr,
      this.contact= this.data.contact,
      this.principal_amt= this.data.principal_amt,
      this.loan_roi= this.data.loan_roi,
      this.emi_amt= this.data.emi_amt,
      this.equip_name= this.data.equip_name,
      this.equip_model_no =this.data.equip_model_no,
      this.equip_price= this.data.equip_price,
  
      this.emi_no_paid= this.data.emi_no_paid,
      this.emi_no_total= this.data.emi_no_total,
      this.emi_start_date= this.data.emi_start_date,
      this.emi_end_date= this.data.emi_end_date,
      this.Os_principal_amt= this.data.Os_principal_amt,

      this.doc_verify_status= this.data.doc_verify_status,

      this.application_status= this.data.application_status,
      this.action_taken= this.data.action_taken
    
    })
    this.data1=ld;
  }

  openModalWithClass(template: TemplateRef<any>) {  
        this.modalRef = this.modalService.show(  
          template,  
          Object.assign({}, { class: 'gray modal-lg' })  
        );  
      }  

      data1:Disbursement;
      success(){  

        this.status="InProcess";
        this.data1.id=this.id;
        this.data1.name=this.name,
        this.data1.addr=this.addr ,
        this.data1.contact=this.contact ,
        this.data1.principal_amt=this.principal_amt,
        this.data1.loan_roi=this.loan_roi ,
        this.data1.emi_amt=this.emi_amt,
        this.data1.equip_name=this.equip_name,
        this.data1.equip_model_no=this.equip_model_no,
        this.data1.equip_price=this.equip_price,
  
        this.data1.emi_no_paid=this.emi_no_paid,
        this.data1.emi_no_total=this.emi_no_total,
        this.data1.emi_start_date=this.emi_start_date,
        this.data1.emi_end_date=this.emi_end_date,
        this.data1.Os_principal_amt=this.Os_principal_amt,

        this.data1.doc_verify_status=this.doc_verify_status,

        this.data1.application_status=this.status,
        this.data1.action_taken=this.action_taken


        this.s.changeMessage(this.id);

        this.s.changeAppl_status(this.data1).subscribe
        (
          (res) =>
          {

          }
        )

      sessionStorage.setItem("role", "ah");
      this.router.navigateByUrl("role/ah/loan-tranfer");
      }


      status:string;

      rejectAppl_Status(db:Disbursement)
      {
        console.log(db);
        this.status="Defaulter";
        db.application_status=this.status;
        this.s.changeAppl_status(db).subscribe
        (
          (res) =>
          {

          }
        )
        window.location.reload()
      
      }
}
