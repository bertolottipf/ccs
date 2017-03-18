import { Component, OnInit } from '@angular/core';
import { DressService } from '../../services/dress.service';
import { Dress } from '../../classes/dress';
import { Observable } from 'rxjs';


@Component({
	selector: 'app-dresses-list',
	templateUrl: './dresses-list.component.html',
	styleUrls: ['./dresses-list.component.scss'],
	providers: [DressService]
})
export class DressesListComponent implements OnInit {

	dress: Dress[];
	json: string;

	data: Observable<Array<any>>;

	constructor(private _dressService: DressService) {
	}

	getAll() {
		this._dressService.getAll().subscribe(res => {
			console.log(JSON.stringify(res)); // loggo il json!!!!
			this.data = res;
		})
	}

	ngOnInit() {
		this.getAll();
	}

}
