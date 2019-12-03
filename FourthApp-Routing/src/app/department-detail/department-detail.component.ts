import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-department-detail',
  template: `
    <p>
       Department with department Id {{departmentId}} {{departmentName}} selected...
      <br/>
       <!--<input type="text" [(ngModel)]="departmentId"/> <br/>
       <input type="text" [(ngModel)]="departmentName"/>
       <button>Update</button>-->
    </p>
  `,
  styles: []
})
export class DepartmentDetailComponent implements OnInit {

  private departmentId:number;
  private departmentName:string;

  constructor(private activatedRouteObj:ActivatedRoute) { }

  ngOnInit() {
     let id=parseInt(this.activatedRouteObj.snapshot.paramMap.get('deptId'));
     let name=this.activatedRouteObj.snapshot.paramMap.get('deptName');
     this.departmentId=id;
     console.log(name);
     this.departmentName=name;
  }

}
