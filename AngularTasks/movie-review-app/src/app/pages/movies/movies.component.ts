import { Component } from '@angular/core';
import { movies } from '../../model/movies';
import { ApiService } from '../../services/api.service';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrl: './movies.component.css'
})
export class MoviesComponent {
  movielist:movies[] = [];
  constructor(private as: ApiService) { }

  movieTypes: string[] = [
    'All',
   'Action',
   'Drama',
   'Love',
   'Adventure',
   'Horror',
   'Comedy'
   ];

   selected:string = 'All'

  ngOnInit(): void {
    this.as.getMovies().subscribe({
      next:(data: any) => {
      this.movielist = data;
      },
      error:(err: any) => {
        console.log(err);
      }
    })
  }
}
