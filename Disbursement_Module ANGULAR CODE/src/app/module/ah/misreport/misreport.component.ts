import { Component, OnInit, TemplateRef } from '@angular/core';
import { Disbursement } from '../Disbursement';
import { AhServiceService } from '../ah-service.service';
import { BsModalService, BsModalRef } from 'ngx-bootstrap/modal'; 


@Component({
  selector: 'app-misreport',
  templateUrl: './misreport.component.html',
  styleUrls: ['./misreport.component.scss']
})
export class MISReportComponent implements OnInit {

  searchText: string="";
  p:number=1;
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


    data: Disbursement;

constructor(private s:AhServiceService, private modalService: BsModalService) {
  
} 

column = ["APPLICATION ID", "APPLICANT NAME", "PRINCIPAL AMOUNT", 
          "O/s PRINCIPAL AMOUNT", "APPLICATION STATUS" ];

index = ["id","name", "principal_amt", "Os_principal_amt", "application_status"];

ledger:Disbursement[]=[];
  new_ledger:Disbursement[]=[];
  Inprocess_ledger:Disbursement[]=[];
  defaulter_ledger:Disbursement[]=[];


ngOnInit() {
  this.s.getAlldata().subscribe
    (
      (response)=> 
    {
      this.ledger=response
      
      this.ledger.forEach(element => {
       
      });
    },
    (error) => console.log(error)
    ); 
      
}


selected_id(ld:Disbursement)
  {
    
    this.s.getDisbById(ld.id).subscribe
    (
      (response:Disbursement)=> 
    {
      this.data=response;
      
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

  }




  // Pie
  
  public pieChartLabels:string[] = ['Completed', 'InProcess', 'Defaulter'];
  public pieChartData:number[]=[5,3,2];
  public pieChartType:string = 'pie';
  
  
  
  // events
  public chartClicked(e:any):void {
    console.log(e);
  }
 
  public chartHovered(e:any):void {
    console.log(e);
  }



  
  openModalWithClass(template: TemplateRef<any>) {  
    this.modalRef = this.modalService.show(  
      template,  
      Object.assign({}, { class: 'gray modal-lg' })  
    );  
  }  

  success(){

    this.s.getLedgerdata(this.id).subscribe(
      (res)=>{

      }
      );
  
    window.open("http://localhost:8085/api/ledgerpdf");
    
    }

}

