import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { AdmindashboarComponent } from "./admindashboar/admindashboar.component";
import { Routes, RouterModule } from "@angular/router";
const adminrouting: Routes = [
  { path: "admindashboar", component: AdmindashboarComponent }
];

@NgModule({
  declarations: [AdmindashboarComponent],
  imports: [CommonModule,
  RouterModule.forChild(adminrouting)]
})
export class AdminModule {}
