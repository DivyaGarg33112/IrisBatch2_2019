import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-department-list',
  template: `<br/><h3>Department List</h3>
  <ul class="list-group list-group-flush" >
    <li (click)="onSelect(department)" *ngFor="let department of departments" 
    class="list-group-item">
      {{department.id}}   {{department.name}}
    </li>
  </ul>`,
  styles: []
})
export class DepartmentListComponent implements OnInit {

  departments=[
    {"id":1,"name":"Angular"},
    {"id":2,"name":"Node"},
    {"id":3,"name":"Mongo DB"},
    {"id":4,"name":"Ruby"},
    {"id":5,"name":"Bootstrap"},
  ];
  constructor(private router:Router) { }
  ngOnInit() {
  }
onSelect(dept:any){
    console.log('I m clicked : '+dept.id+" "+dept.name);
    this.router.navigate(['/departments',dept.id,dept.name]);
  }

}
