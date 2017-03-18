import { Component } from '@angular/core';
import { DressesListComponent } from './components/dresses-list/dresses-list.component';
import { DressDetailsComponent } from './components/dress-details/dress-details.component';

import { DressService } from './services/dress.service';

import { HttpModule } from '@angular/http';


@Component({
	selector: 'app-root',
	templateUrl: './app.component.html',
	styleUrls: ['./app.component.scss'],
	providers: [HttpModule]
})
export class AppComponent {
	title = 'ChildrenClothesSurfing';
}
