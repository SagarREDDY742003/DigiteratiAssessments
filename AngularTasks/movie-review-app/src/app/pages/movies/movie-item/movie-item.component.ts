import { Component, Input } from '@angular/core';
import { movies } from '../../../model/movies';
import { Router } from '@angular/router';

@Component({
  selector: 'app-movie-item',
  templateUrl: './movie-item.component.html',
  styleUrl: './movie-item.component.css'
})
export class MovieItemComponent {
  @Input() movie:movies={
    id:"",
    name:"",
    rating:"",
    category:"",
    description:"",
    image:""
  }

  constructor(private router:Router){}

  onMovieClick(id:string) {
    this.router.navigate(['/movies', id], { state: { title: this.movie.name } });
  }

}
