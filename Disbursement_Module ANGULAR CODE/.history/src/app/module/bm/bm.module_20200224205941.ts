import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BmdashboardComponent } from './bmdashboard/bmdashboard.component';
import { Routes, RouterModule } from '@angular/router';
const bmrouting:Routes=[
  {path:'bmdashboard',component:BmdashboardComponent}
]
@NgModule({
  declarations: [BmdashboardComponent],
  imports: [
    CommonModule,
    RouterModule.forChild(bmrouting)
  ]
})
export class BmModule { }
