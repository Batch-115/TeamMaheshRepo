import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { OedashboardComponent } from './oedashboard/oedashboard.component';
import { Routes, RouterModule } from '@angular/router';
const oerouting:Routes=[
  {path:'oedashboard',component:OedashboardComponent}
]
@NgModule({
  declarations: [OedashboardComponent],
  imports: [
    CommonModule,
    RouterModule.forChild(oerouting)
  ]
})
export class OeModule { }
