import { Routes } from '@angular/router';

export const ADMIN_PATH = 'admin';

export const routes: Routes = [
  {
    path: '',
    loadChildren: () => import('./view/home/home.routes').then(mod => mod.routes)
  },
  {
    path: ADMIN_PATH,
    loadChildren: () => import('./view/administration/administration.routes').then(mod => mod.routes)
  },
  {
    path: '**',
    redirectTo: '404'
  }
];
