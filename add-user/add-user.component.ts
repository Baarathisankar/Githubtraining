import { Component, OnInit } from '@angular/core';
import { NgModule } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { Subscription } from "rxjs/Rx";
import { UserService} from '../service/index';
@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css'],
  providers: [UserService]
})
export class AddUserComponent implements OnInit {
firstname:string;
lastname:string;
  constructor(private userService:UserService ) { }

  ngOnInit() {
  }

  addUser(){
    console.log("firstname="+this.firstname);
     console.log("lastname="+this.lastname);
        this.userService.add(this.firstname,this.lastname).subscribe(result => {
          if (result.statusCode==200) {
         //   this.router.navigate([KRONOS.ROUTERLINKS.USER]);
          }else {
            alert("error");
          }
        });
  }

}
