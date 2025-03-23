import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'moviefilteronreviews'
})
export class MoviefilteronreviewsPipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): unknown {
    return null;
  }

}
