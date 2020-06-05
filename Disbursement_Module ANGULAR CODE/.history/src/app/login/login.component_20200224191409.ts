import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";
export interface user {
  username: string;
  password: string;
  repassword: string;
  email: string;
}
@Component({
  selector: "app-login",
  templateUrl: "./login.component.html",
  styleUrls: ["./login.component.scss"]
})

export class LoginComponent implements OnInit {
  constructor(private router: Router) {}
  u: user;

  ngOnInit() {}
  login(username, password) {
    console.log(username, password);

    if (username === "oe" && password === "oe") {
      console.log("in oe");
      sessionStorage.setItem("role", "oe");
      this.router.navigateByUrl("role/oe/oedashboard");
    }
    if (username === "re" && password === "re") {
      console.log("in re");
      sessionStorage.setItem("role", "re");
      this.router.navigateByUrl("role/re/redashboard");
    }
    if (username === "bm" && password === "bm") {
      console.log("in bm");
      sessionStorage.setItem("role", "bm");
      this.router.navigateByUrl("role/bm/bmdashboard");
    }
    if (username === "cm" && password === "cm") {
      console.log("in cm");
      sessionStorage.setItem("role", "cm");
      this.router.navigateByUrl("role/cm/cmdashboard");
    }
  }
}
