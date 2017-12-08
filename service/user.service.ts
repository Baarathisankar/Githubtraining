import { Injectable } from '@angular/core';
import { Http, Headers, Response, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
//import { CookieModule } from 'ngx-cookie';
import { Subject } from 'rxjs/Subject';

@Injectable()
export class UserService {
  public base : any = "http://172.17.22.252:9000/training/user/addUser";
  constructor(private http:Http) {
   }
       getRequestOptions(): RequestOptions {
        const headers: Headers = new Headers({ 'Content-Type': 'application/json' });
        const requestOptions: RequestOptions = new RequestOptions({ headers: headers });
        return requestOptions;
    }

  add(firstname,lastname) {
    console.log(firstname);
    return this.http.post(this.base,JSON.stringify({firstname:firstname,lastname:lastname}), this.getRequestOptions())
      .map((response: Response) => {
        return response.json();
      });
  }




        // let headers = new Headers({ 'Content-Type': 'application/json' });
        // let options = new RequestOptions({ headers: headers });
        // let obj = {
        //     firstname: firstname,
        //     lastname: lastname
        // }
        // return this.http.post(this.BASE, obj, options)
        //     .map((response: Response) => {
        //         let user = response.json();
        //         return user;
        //     })
}
