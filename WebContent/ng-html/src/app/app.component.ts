import { Component } from '@angular/core';
//import { enableProdMode } from '@angular/core';
import { HttpModule } from '@angular/http';

import { DressesListComponent } from './components/dresses-list/dresses-list.component';
import { DressDetailsComponent } from './components/dress-details/dress-details.component';

import { DressService } from './services/dress.service';


@Component({
	selector: 'app-root',
	templateUrl: './app.component.html',
	styleUrls: ['./app.component.scss'],
	providers: [HttpModule]
})
export class AppComponent {
	title = 'ChildrenClothesSurfing';
}
