import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { AhdashboardComponent } from "./ahdashboard/ahdashboard.component";
import { Routes, RouterModule } from "@angular/router";
import { LoanTransferComponent } from './loan-transfer/loan-transfer.component';
import { LoanReceiptComponent } from './loan-receipt/loan-receipt.component';
import { LoanLedgerComponent } from './loan-ledger/loan-ledger.component';
import { MISReportComponent } from './misreport/misreport.component';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { ModalModule } from 'ngx-bootstrap/modal'; 
import { ChartsModule } from 'ng2-charts';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {NgxPaginationModule} from 'ngx-pagination';



const ahrouting: Routes = 
[
  { path: "ahdashboard", component: AhdashboardComponent },
  { path: "loan-tranfer", component: LoanTransferComponent },
  { path: "loan-receipt", component: LoanReceiptComponent },
  { path: "loan-ledger", component: LoanLedgerComponent },
  { path: "mis-report", component: MISReportComponent }
];
@NgModule
({
  declarations: [AhdashboardComponent, LoanTransferComponent, LoanReceiptComponent, LoanLedgerComponent, MISReportComponent],
  imports: [CommonModule, RouterModule.forChild(ahrouting), HttpClientModule, ReactiveFormsModule, FormsModule,
            ModalModule.forRoot(), ChartsModule, Ng2SearchPipeModule, NgxPaginationModule]
})
export class AhModule {}
