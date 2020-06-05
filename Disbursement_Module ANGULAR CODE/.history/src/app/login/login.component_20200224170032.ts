import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

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
  constructor(private router: Router) { }

  ngOnInit() {
  }

  toggle() {
    console.log('toggle');
    this.show = !this.show;
    // CHANGE THE NAME OF THE BUTTON.
  }
  toggle1() {
    this.show = true;
    // CHANGE THE NAME OF THE BUTTON.
  }
  login(username, password) {
    if (username === 'doctor' && password === 'doctor') {
      console.log('in doctor');
      sessionStorage.setItem('role', 'doctor');
      this.router.navigateByUrl('role/doctor/doctordash');
    }
    if (username === 'emp' && password === 'emp') {
      console.log('in emp');
      sessionStorage.setItem('role', 'emp');
      this.router.navigateByUrl('role/emp/empdash');
    }
    if (username === 'nurse' && password === 'nurse') {
      console.log('in nurse');
      sessionStorage.setItem('role', 'nurse');
      this.router.navigateByUrl('role/nurse/nursedash');
    }
    if (username === 'stu' && password === 'stu') {
      console.log('in student');
      sessionStorage.setItem('role', 'student');
      this.router.navigateByUrl('role/student/studash');
    }
    if (username === 'admin' && password === 'admin') {
      console.log('in admin');
      sessionStorage.setItem('role', 'admin');
      this.router.navigateByUrl('role/admin/admindash');
    }
  }
}
