import {ActivatedRouteSnapshot, RouterStateSnapshot, Routes} from "@angular/router";
import {inject} from "@angular/core";
import {TimezoneService} from "../../../shared/service/timezone.service";

export const resolveFn = (route: ActivatedRouteSnapshot, state: RouterStateSnapshot) => {
  const service = inject(TimezoneService)
  return service.getTimezoneById(Number(route.paramMap.get('id')))
}

export const routes: Routes = [
  {
    path: 'new',
    loadComponent: () => import('./timezone-edit/timezone-edit.component').then(mod => mod.TimezoneEditComponent)
  },
  {
    path: ':id',
    loadComponent: () => import('./timezone.component').then(mod => mod.TimezoneComponent),
    resolve: { data: resolveFn}
  },
  {
    path: ':id/edit',
    loadComponent: () => import('./timezone-edit/timezone-edit.component').then(mod => mod.TimezoneEditComponent),
    resolve: { data: resolveFn}
  }
];
