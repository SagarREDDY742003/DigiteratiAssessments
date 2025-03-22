import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ApiService } from '../../../services/api.service';
import { movies } from '../../../model/movies';

@Component({
  selector: 'app-movie-details',
  templateUrl: './movie-details.component.html',
  styleUrl: './movie-details.component.css'
})
export class MovieDetailsComponent {
  id:any = '';
  title:string = '';
  movie:movies={
    id: "",
    name: '',
    rating: '',
    category: '',
    description: '',
    image: ''
  };

  constructor(private route: ActivatedRoute,private router:Router,private api:ApiService){
    this.id = this.route.snapshot.paramMap.get('id');
    const navigation = this.router.getCurrentNavigation();
    if (navigation?.extras.state) {
      this.title = navigation.extras.state['title'];
    }
  }

  ngOnInit() {
   this.api.getMovieDetails(this.id).subscribe({
     next	: (result:any) => {
        this.movie = result[0];
     },
     error: (error:any) => console.log(error)
   });
  }
}
