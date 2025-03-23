import { Pipe, PipeTransform } from '@angular/core';
import { Reviews } from '../model/reviews';

@Pipe({
  name: 'reviewfilter'
})
export class ReviewfilterPipe implements PipeTransform {

  transform(reviewlist: Reviews[],categoryselected:string, movieselected:string ): Reviews[] {
    console.log(movieselected)
    if((categoryselected==='All')&&(movieselected==='All'))
      return reviewlist;

    else if((movieselected==='All')&&(categoryselected !='All'))
      return reviewlist.filter(review => review.category===categoryselected)

    return reviewlist.filter(review=>review.category===categoryselected).filter(review => review.moviename===movieselected)
  }

}
