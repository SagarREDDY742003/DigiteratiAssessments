import { Component } from '@angular/core';
import { ApiService } from '../../services/api.service';
import { Reviews } from '../../model/reviews';
import { movies } from '../../model/movies';

@Component({
  selector: 'app-reviews',
  templateUrl: './reviews.component.html',
  styleUrl: './reviews.component.css'
})
export class ReviewsComponent {
  constructor(private as:ApiService){}
  reviewlist:Reviews[]=[];
  movielist:movies[]=[];
  movielistfiltered:movies[]=[]
  categories: string[] = [
    'All',
   'Action',
   'Drama',
   'Love',
   'Adventure',
   'Horror',
   'Comedy'
   ];
   
  categoryselected:string='All'
  movieselected:string='All'

  getmovies(categoryselected:string){
    this.movielistfiltered=this.movielist.filter(movie=>movie.category===categoryselected)
  }

  ngOnInit():void{
    this.as.getReviews().subscribe({
      next:(result:Reviews[])=>{this.reviewlist=result},
      error:(err:any)=>{console.log(err)}
    })
    this.as.getMovies().subscribe({
      next:(result:movies[])=>{this.movielist=result},
      error:(err:any)=>{console.log(err)}
    })
  }
}
