import { Injectable } 		from '@angular/core';
import { Http, Response } 	from '@angular/http';

import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';

import { Dress } from '../classes/dress';

@Injectable()
export class DressService {

	private dressUrl: string = 'http://localhost:8080/ChildrenClothesSurf/rest/dress';

	constructor(private http: Http) { }


	getAll(): Observable<Dress[]> {
		return this.http.get(this.dressUrl)
				.map(this.extractData)
				;
	}



	getInfo(id:number): Observable<Dress> {
		return this.http.get(this.dressUrl + "/" + id)
				.map(this.extractData)
				;
	}




	private extractData(res: Response) {
		let json = res.json();
		return json || { };
	}

}