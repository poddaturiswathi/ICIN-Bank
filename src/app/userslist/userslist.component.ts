import { Component } from '@angular/core';
import { Users } from '../users';
import { UsersService } from '../users.service';

@Component({
  selector: 'app-userslist',
  templateUrl: './userslist.component.html',
  styleUrls: ['./userslist.component.css']
})
export class UserslistComponent {
        us:Users[]=[];
    constructor(private serrr:UsersService){}

    ngOnInit():void{
          this.gethear();
    }

    gethear(){
      this.serrr.getusers().subscribe(data=>{
        this.us=data;
      })
    }

}