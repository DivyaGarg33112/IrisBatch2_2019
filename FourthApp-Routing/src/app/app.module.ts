import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms'
// import { AppRoutingModule,routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { TestComponent } from './test/test.component';
// import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
// import { DepartmentDetailComponent } from './department-detail/department-detail.component';
// import { MycomponentComponent } from './mycomponent.component';

@NgModule({
  declarations: [
    AppComponent,
   // routingComponents,
    TestComponent
    // PageNotFoundComponent,
    // DepartmentDetailComponent,
    // MycomponentComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
    //,AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
