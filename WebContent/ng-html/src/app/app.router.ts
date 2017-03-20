import { ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { DressesListComponent } from './components/dresses-list/dresses-list.component';
import { DressDetailsComponent } from './components/dress-details/dress-details.component';

export const router: Routes = [
	{ path: '', redirectTo: 'home', pathMatch: 'full' },
	{ path: 'home', component: HomeComponent },
	{ path: 'dress_detail', component: DressDetailsComponent },
	{ path: 'dress_list', component: DressesListComponent },
];


export const routes: ModuleWithProviders = RouterModule.forRoot(router);