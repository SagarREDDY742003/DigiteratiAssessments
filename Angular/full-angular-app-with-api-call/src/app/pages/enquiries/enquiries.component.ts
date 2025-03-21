import { Component } from '@angular/core';
import { Enquiry } from '../model/enquiry';
import { ApiService } from '../../services/api.service';

@Component({
  selector: 'app-enquiries',
  templateUrl: './enquiries.component.html',
  styleUrl: './enquiries.component.css'
})
export class EnquiriesComponent {
  enquirylist:Enquiry[]=[];

  constructor(private as:ApiService){}

  ngOnInit():void{
    this.as.getEnquiry().subscribe({
      next:(result:Enquiry[])=>{this.enquirylist=result},
      error:(err:any)=>{console.log(err)}
    })
  }
}
