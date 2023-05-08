import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class FooBarQuixService {

  rootUrl='http://localhost:8080/foo-bar-quix/' ;
  private httpOptions = {
  headers: new HttpHeaders( { 'Content-Type': 'application/json' })
 };
  httpClient: any;


  constructor(private http: HttpClient) { }

  getConvertedNumber(inputNumber:number) {
    return this.http.get(this.rootUrl+inputNumber);
  }

}
