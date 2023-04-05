import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { UserslistComponent } from './userslist/userslist.component';

const routes: Routes = [
  {path : "myyslistt" ,component:UserslistComponent},
  {path :"adminlistr" , component:AdminComponent},
  {path : "userrlks", component:UserComponent},
  {path : "backhome", component:AppComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }