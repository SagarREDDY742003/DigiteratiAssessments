import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http:HttpClient) { }

  getCategories():Observable<any>{
    return this.http.get('http://localhost:4600/categories');
  }

  getMovies():Observable<any>{
    return this.http.get('http://localhost:4600/movies');
  }
  getMovieDetails(id:string):Observable<any>{
    return this.http.get(`http://localhost:4600/movies?id=${id}`);
  }

  addReview(data:any):Observable<any>{
    return this.http.post('http://localhost:4600/reviews',data);
  }

  getReviews():Observable<any>{
    return this.http.get('http://localhost:4600/reviews');
  }
}
