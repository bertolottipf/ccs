import { Component, OnInit } 				from '@angular/core';
import { Router, ActivatedRoute, Params }	from '@angular/router';
import { Observable } 						from 'rxjs/Observable';

import { DressService } from '../../services/dress.service';
import { Dress } from '../../classes/dress';


@Component({
	selector: 'app-dress-details',
	templateUrl: './dress-details.component.html',
	styleUrls: ['./dress-details.component.scss'],
	providers: [DressService]
})
export class DressDetailsComponent implements OnInit {
	errorMessage: string;
	dresses: Dress[];
	dress: Dress;
	mode = 'Observable';
	dressId: number;

	constructor(private dressService: DressService, private activatedRoute: ActivatedRoute) {
	}

	ngOnInit() {
		this.activatedRoute.queryParams.subscribe((params: Params) => {
			// recupero l'id
			this.dressId = params['id'];
		});
		this.getInfo(this.dressId);
	}

	getInfo(id:number) {
		// console.log("dress-details.component: Fin qui però....");
		this.dressService.getInfo(this.dressId)
				.subscribe(
					dress => this.dress = dress,
					error => this.errorMessage = <any>error
				);
	}


}
