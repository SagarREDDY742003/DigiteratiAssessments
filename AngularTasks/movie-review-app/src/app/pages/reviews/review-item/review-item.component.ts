import { Component, Input } from '@angular/core';
import { Reviews } from '../../../model/reviews';

@Component({
  selector: 'app-review-item',
  templateUrl: './review-item.component.html',
  styleUrl: './review-item.component.css'
})
export class ReviewItemComponent {
  @Input() review:Reviews={
    id: "",
    name: "",
    moviename: "",
    category: "",
    message: ""
  }
}
