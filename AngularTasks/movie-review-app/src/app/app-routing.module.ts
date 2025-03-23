import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { MoviesComponent } from './pages/movies/movies.component';
import { ReviewsComponent } from './pages/reviews/reviews.component';
import { MovieDetailsComponent } from './pages/movies/movie-details/movie-details.component';
import { LoginComponent } from './common/login/login.component';
import { reviewGuard } from './guard/review.guard';

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'movies',component:MoviesComponent},
  {path:'reviews',component:ReviewsComponent, canActivate:[reviewGuard] },
  {path:'movies/:id',component:MovieDetailsComponent},
  {path:'login',component:LoginComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
