import { Injectable } from '@angular/core';
import { Http, Headers, Response } from '@angular/http';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';

@Injectable()
export class DressService {

	private searchUrl: string;

	constructor(private _http: Http) { }

	getAll(){
		this.searchUrl = 'http://localhost:8080/ChildrenClothesSurf/rest/dress';
		return this._http.get(this.searchUrl).map(res => res.json())
	}

}
