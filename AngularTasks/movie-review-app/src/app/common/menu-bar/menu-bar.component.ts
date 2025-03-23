import { UpperCasePipe } from '@angular/common';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu-bar',
  templateUrl: './menu-bar.component.html',
  styleUrl: './menu-bar.component.css'
})
export class MenuBarComponent {
  status : boolean=false
  loginmenu:string="login"
  user:string=""
  constructor(private router:Router){
    let username = localStorage.getItem('username')
    if(username){
      this.user="Hello "+username
      this.status=true
      this.loginmenu="logout"
    }
  }

  move(){
    if(this.status){
      this.router.navigate(['/reviews'])
    }
    else{
      this.router.navigate(['/login'])
    }
  }
  
  loginhandler(){
    if(this.status){
      localStorage.removeItem('username')
      this.router.navigate(['']).then(()=>{
        window.location.reload()
      })
    }
    else{
      this.router.navigate(['/login'])
    }
  }

}
