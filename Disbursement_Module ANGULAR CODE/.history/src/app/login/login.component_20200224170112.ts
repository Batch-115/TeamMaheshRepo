import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  public show = true;
  public notshow = true;
  public username = '';
  public password = '';
  public email = '';
  constructor() { }

  ngOnInit() {
  }
}
