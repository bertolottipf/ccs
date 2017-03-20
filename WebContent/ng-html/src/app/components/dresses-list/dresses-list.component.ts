import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs/Observable';

import { DressService } from '../../services/dress.service';
import { Dress } from '../../classes/dress';


@Component({
	selector: 'app-dresses-list',
	templateUrl: './dresses-list.component.html',
	styleUrls: ['./dresses-list.component.scss'],
	providers: [DressService]
})
export class DressesListComponent implements OnInit {
	errorMessage: string;
	dresses: Dress[];
	mode = 'Observable';

	constructor(private dressService: DressService) {
	}

	ngOnInit() {
		this.getAll();
	}

	getAll() {
		this.dressService.getAll()
				.subscribe(
					dresses => this.dresses = dresses,
					error => this.errorMessage = <any>error
				);
	}

}
