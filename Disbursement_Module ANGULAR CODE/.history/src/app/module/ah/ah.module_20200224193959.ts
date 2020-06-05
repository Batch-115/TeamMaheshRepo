import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { AhdashboardComponent } from "./ahdashboard/ahdashboard.component";
import { Routes, RouterModule } from "@angular/router";
const ahrouting: Routes = [
  { path: "ahdashboard", component: AhdashboardComponent }
];
@NgModule({
  declarations: [AhdashboardComponent],
  imports: [CommonModule, RouterModule.forChild(ahrouting)]
})
export class AhModule {}
