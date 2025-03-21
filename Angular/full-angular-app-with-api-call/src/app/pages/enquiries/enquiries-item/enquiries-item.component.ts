import { Component, Input } from '@angular/core';
import { Enquiry } from '../../model/enquiry';

@Component({
  selector: 'app-enquiries-item',
  templateUrl: './enquiries-item.component.html',
  styleUrl: './enquiries-item.component.css'
})
export class EnquiriesItemComponent {
  @Input() enquiry: Enquiry={
    id: "",
    name: "",
    email: "",
    serviceType: "",
    message: ""
  }
}
