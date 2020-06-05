import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { OedashboardComponent } from './oedashboard/oedashboard.component';
import { Routes, RouterModule } from '@angular/router';
import { LoandetailsComponent } from './loandetails/loandetails.component';

const oerouting:Routes=[
  {path:'oedashboard',component:OedashboardComponent},
  {path:'loandetails',component:LoandetailsComponent}
]
@NgModule({
  declarations: [OedashboardComponent, LoandetailsComponent],
  imports: [
    CommonModule,
    RouterModule.forChild(oerouting)
  ]
})
export class OeModule { }
