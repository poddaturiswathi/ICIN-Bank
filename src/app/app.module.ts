import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import{HttpClientModule} from '@angular/common/http';
import { UserslistComponent } from './userslist/userslist.component';
import { MainDashboardComponent } from './main-dashboard/main-dashboard.component';
import { AdminComponent } from './admin/admin.component';
import { UserComponent } from './user/user.component';
import { UsersComponent } from './users/users.component'
@NgModule({
  declarations: [
    AppComponent,
    UserslistComponent,
    MainDashboardComponent,
    AdminComponent,
    UserComponent,
    UsersComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }