import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './pages/home/home.component';
import { MoviesComponent } from './pages/movies/movies.component';
import { ReviewsComponent } from './pages/reviews/reviews.component';
import { MenuBarComponent } from './common/menu-bar/menu-bar.component';
import { LoginComponent } from './common/login/login.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CategoryItemsComponent } from './pages/home/category-items/category-items.component';
import { MovieItemComponent } from './pages/movies/movie-item/movie-item.component';
import { MovieDetailsComponent } from './pages/movies/movie-details/movie-details.component';
import { ReviewFormComponent } from './pages/movies/review-form/review-form.component';
import { MoviefilterPipe } from './pipes/moviefilter.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    MoviesComponent,
    ReviewsComponent,
    MenuBarComponent,
    LoginComponent,
    CategoryItemsComponent,
    MovieItemComponent,
    MovieDetailsComponent,
    ReviewFormComponent,
    MoviefilterPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
