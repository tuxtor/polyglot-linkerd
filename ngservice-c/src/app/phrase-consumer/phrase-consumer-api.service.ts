import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable} from 'rxjs';
import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class PhraseConsumerApiService {
  SERVICE_URL = environment.backurl;

  constructor(private httpClient: HttpClient) { }

  public getPhrase(): Observable<any>{
    return this.httpClient.get(this.SERVICE_URL + '/phrase-demo', {responseType: 'text'});
  }
}
