import { Component, Input } from '@angular/core';
import { categories } from '../../../model/categories';

@Component({
  selector: 'app-category-items',
  templateUrl: './category-items.component.html',
  styleUrl: './category-items.component.css'
})
export class CategoryItemsComponent {
  @Input() category: categories= {
    id: '',
    title: '',
    description: '',
    image: ''
  }
}
