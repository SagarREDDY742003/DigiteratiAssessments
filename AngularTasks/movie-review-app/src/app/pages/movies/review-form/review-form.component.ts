import { Component, Input } from '@angular/core';
import { ApiService } from '../../../services/api.service';

@Component({
  selector: 'app-review-form',
  templateUrl: './review-form.component.html',
  styleUrl: './review-form.component.css'
})
export class ReviewFormComponent {
  @Input() moviename:string=""   
  @Input() category:string=""   

  name: string = '';
  message: string = '';
  errors:string[]=[]
 
  movieTypes: string[] = [
    'All',
   'Action',
   'Drama',
   'Love',
   'Adventure',
   'Horror',
   'Comedy'
   ]
 
  constructor(private api: ApiService) {}
  
  submitForm() {
    this.errors=[]
    if(!this.name || this.name.length<3){
      this.errors.push("Name should be atleast three characters long")
    }
    if(!this.message || this.message.length<10){
      this.errors.push("Message should be atleast 10 characters long")
    }

    if(this.errors.length==0){
      this.api.addReview({
        name: this.name,
        moviename: this.moviename,
        category: this.category,
        message: this.message
      }).subscribe({
          next: (response) => {
            console.log("Review Form Response:", response);
            this.name = '';
            this.moviename = '';
            this.category = '';
            this.message = '';
            alert("Review Submitted Successfully")	
          },
          error: (error) => {
            alert("Something went wrong. Please try again")
         }});
    }
 
  }
}
