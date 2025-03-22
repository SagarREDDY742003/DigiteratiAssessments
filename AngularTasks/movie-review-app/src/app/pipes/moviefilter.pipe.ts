import { Pipe, PipeTransform } from '@angular/core';
import { movies } from '../model/movies';

@Pipe({
  name: 'moviefilter'
})
export class MoviefilterPipe implements PipeTransform {

  transform(movielist: movies[], movieType:string): movies[] {
    if(movieType === 'All') 
      return movielist;
    
    return movielist.filter(movie => movie.category === movieType);
  }

}
