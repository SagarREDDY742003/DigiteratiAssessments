import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { MoviesComponent } from './pages/movies/movies.component';
import { ReviewsComponent } from './pages/reviews/reviews.component';
import { MovieDetailsComponent } from './pages/movies/movie-details/movie-details.component';

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'movies',component:MoviesComponent},
  {path:'reviews',component:ReviewsComponent},
  {path:'movies/:id',component:MovieDetailsComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
