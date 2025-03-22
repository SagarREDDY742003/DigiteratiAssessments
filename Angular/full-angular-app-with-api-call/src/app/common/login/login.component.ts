import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  constructor(private router:Router){}
  username: string = '';
  password: string = '';
  login(){
    if(this.username=="peter" && this.password=="password"){
      localStorage.setItem("username",this.username)
      this.router.navigate(['']).then(() => {
        window.location.reload();
      });
    }
    else alert("Invalid Credentials")
  }
}
