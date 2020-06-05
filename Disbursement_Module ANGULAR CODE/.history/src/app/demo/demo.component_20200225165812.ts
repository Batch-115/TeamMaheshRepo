import { Component, OnInit } from "@angular/core";
import { Customer } from "../model/customer";
import { FormGroup, FormBuilder, FormArray } from "@angular/forms";
import { Add } from "../model/add";

@Component({
  selector: "app-demo",
  templateUrl: "./demo.component.html",
  styleUrls: ["./demo.component.scss"]
})
export class DemoComponent implements OnInit {
  constructor(private fb: FormBuilder) {}
  user: FormGroup;
  ngOnInit() {
    this.user = this.fb.group({
      name: [],
      address: this.fb.array([this.fb.group({ area: "", city: "", state: "" })])
    })
  }

  get address() {
    return this.user.get('address') as FormArray;
  }

  addAddress() {
    this.address.push(this.fb.group({ area: "", city: "", state: "" }));
  }
  
  deleteAddress(index) {
    this.address.removeAt(index);
  }

}
