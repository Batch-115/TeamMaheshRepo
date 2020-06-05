import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RedashboardComponent } from './redashboard/redashboard.component';
import { Routes, RouterModule } from '@angular/router';
const rerouting:Routes=[
  {path:'redashboard',component:RedashboardComponent}
]
@NgModule({
  declarations: [RedashboardComponent],
  imports: [
    CommonModule,
    RouterModule.forChild(rerouting)
  ]
})
export class ReModule { }
