import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { AdmindashboarComponent } from "./admindashboar/admindashboar.component";
import { Routes } from "@angular/router";
const routes: Routes = [
  { path: "admindashboar", component: AdmindashboarComponent }
];

@NgModule({
  declarations: [AdmindashboarComponent],
  imports: [CommonModule]
})
export class AdminModule {}
