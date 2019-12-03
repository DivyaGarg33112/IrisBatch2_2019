// import { NgModule } from '@angular/core';
// import { Routes, RouterModule } from '@angular/router';
// import { DepartmentListComponent } from './department-list/department-list.component';
// import { EmployeeListComponent } from './employee-list/employee-list.component';
// import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
// import { AppComponent } from './app.component';
// import { DepartmentDetailComponent } from './department-detail/department-detail.component';


// const routes: Routes = [
//   // {path:'',component:DepartmentListComponent},
//   {path:'',redirectTo:'/departments',pathMatch:'full'},
//   {path:'departments',component:DepartmentListComponent},
//   {path:'departments/:deptId/:deptName',component:DepartmentDetailComponent},
//   {path:'employees',component:EmployeeListComponent},
//   /*wild card router with path ** should be the last route in the configuration */
//   {path:'**',component:PageNotFoundComponent}
// ];

// @NgModule({
//   imports: [RouterModule.forRoot(routes)],
//   exports: [RouterModule]
// })
// export class AppRoutingModule { }
// export const routingComponents=[
//   DepartmentListComponent,
//   EmployeeListComponent,PageNotFoundComponent,DepartmentDetailComponent];