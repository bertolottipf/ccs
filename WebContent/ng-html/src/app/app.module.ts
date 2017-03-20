import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule, JsonpModule } from '@angular/http';
import {DataTableModule} from "angular2-datatable";

import { routes } from './app.router';

import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { SidebarComponent } from './components/sidebar/sidebar.component';
import { HomeComponent } from './components/home/home.component';
import { DressesListComponent } from './components/dresses-list/dresses-list.component';
import { DressDetailsComponent } from './components/dress-details/dress-details.component';

import { DressService } from './services/dress.service';

@NgModule({
	declarations: [
		AppComponent,
		HeaderComponent,
		FooterComponent,
		SidebarComponent,
		HomeComponent,
		DressesListComponent,
		DressDetailsComponent
	],
	imports: [
		BrowserModule,
		FormsModule,
		HttpModule,
		JsonpModule,
		DataTableModule,
		routes
	],
	bootstrap: [AppComponent]
})
export class AppModule { }
