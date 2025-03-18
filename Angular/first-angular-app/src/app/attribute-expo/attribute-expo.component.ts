import { Component } from '@angular/core';

@Component({
  selector: 'app-attribute-expo',
  templateUrl: './attribute-expo.component.html',
  styleUrl: './attribute-expo.component.css'
})
export class AttributeExpoComponent {
  dataItems:String[]=["Sagar","Basha","Chiru"]

  fontNames: string[] = [
    "Arial", "Verdana", "Helvetica", "Tahoma", "Trebuchet MS", "Times New Roman", 
    "Georgia", "Garamond", "Courier New", "Brush Script MT", "Impact", "Comic Sans MS", 
    "Lucida Sans", "Lucida Console", "Palatino Linotype", "Segoe UI", "Candara", 
    "Calibri", "Cambria", "Consolas", "Franklin Gothic Medium", "Gill Sans", 
    "Century Gothic", "Arial Black", "Book Antiqua", "Copperplate", "Papyrus", 
    "Perpetua", "Rockwell", "Symbol"
  ]
  fontname=this.fontNames[2]

  theme1:any={
    backgroundColor: "#f0f8ff",
    fontFamily: "Arial, sans-serif",
    padding: "10px",
    margin: "10px",
    border: "1px solid black",
    height: "300px",
    width: "360px",
  }
  theme2:any={
    backgroundColor: "#faebd7",
    fontFamily: "Arial, sans-serif",
    padding: "10px",
    margin: "10px",
    border: "1px solid black",
    height: "300px",
    width: "360px",
  }
  theme3:any={
    backgroundColor: "#ffd4e1",
    fontFamily: "Arial, sans-serif",
    padding: "10px",
    margin: "10px",
    border: "1px solid black",
    height: "300px",
    width: "360px",
  }
  currentTheme:any=this.theme1
  changeTheme(theme:string){
    switch(theme) {
      case 'theme1':
      this.currentTheme = this.theme1;
      break;
      case 'theme2':
      this.currentTheme = this.theme2;
      break;
      case 'theme3':
      this.currentTheme = this.theme3;
      break;
      default:
      this.currentTheme = this.theme1;
    }
  }
}
