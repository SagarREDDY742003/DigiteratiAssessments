import { CanActivateFn } from '@angular/router';

export const reviewGuard: CanActivateFn = (route, state) => {
  const username = localStorage.getItem('username');
  return username?true:false;
};
