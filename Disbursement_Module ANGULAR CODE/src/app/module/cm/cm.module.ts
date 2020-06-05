import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CmdashboardComponent } from './cmdashboard/cmdashboard.component';
import { Routes, RouterModule } from '@angular/router';
const cmrouting:Routes=[
  {path:'cmdashboard',component:CmdashboardComponent}
]
@NgModule({
  declarations: [CmdashboardComponent],
  imports: [
    CommonModule,
    RouterModule.forChild(cmrouting)
  ]
})
export class CmModule { }
