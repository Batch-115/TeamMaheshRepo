import { Component, OnInit } from "@angular/core";
import { Customer } from "../model/customer";
import { FormGroup, FormBuilder } from "@angular/forms";
import { Add } from "../model/add";

@Component({
  selector: "app-demo",
  templateUrl: "./demo.component.html",
  styleUrls: ["./demo.component.scss"]
})
export class DemoComponent implements OnInit {
  user: FormGroup;
  constructor(private fb: FormBuilder) {}

  ngOnInit() {}
  add = [
    { area: "", city: "", state: "" },
    { area: "", city: "", state: "" }
  ];
}
