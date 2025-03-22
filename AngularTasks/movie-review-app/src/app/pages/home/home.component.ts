import { Component } from '@angular/core';
import { categories } from '../../model/categories';
import { ApiService } from '../../services/api.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  categorieslist:categories[] = [];
    constructor(private as: ApiService) { }

    ngOnInit(): void {
      this.as.getCategories().subscribe({
        next:(data: any) => {
        this.categorieslist = data;
        },
        error:(err: any) => {
          console.log(err);
        }
    });
    }
}
