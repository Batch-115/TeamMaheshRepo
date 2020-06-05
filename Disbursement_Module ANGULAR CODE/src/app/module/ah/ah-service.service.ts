import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Disbursement } from './Disbursement';
import { BehaviorSubject } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class AhServiceService {


  private messageSource = new BehaviorSubject(123);
  currentMessage = this.messageSource.asObservable();

  changeMessage(message: number) {
    this.messageSource.next(message)
  }

  constructor(private http: HttpClient) {
    
   }

  url:string = 'http://localhost:8085/api';


  getAlldata() {
    return this.http.get<Disbursement[]>(this.url+"/new");
  }
  
  getDisbById(id: number)
  {
    return this.http.get<Disbursement>(this.url+"/new/"+id);
  }
  
  changeAppl_status(db:Disbursement)
  {
    return this.http.put(this.url+"/new/"+db.id, db);
  }

  getTranferdata(id: number) {
    return this.http.get<Disbursement>(this.url+"/transfer/"+id);
  }

  getReceiptdata(id: number) {
    return this.http.get<Disbursement>(this.url+"/receipt/"+id);
  }

  getLedgerdata(id: number) {
    return this.http.get<Disbursement[]>(this.url+"/disb/"+id);
  }

}
