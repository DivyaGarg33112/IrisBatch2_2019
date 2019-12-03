import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  template: `
    <div class="container">
      List to be filtered on : 
      <input type="text" [(ngModel)]="filterCriteria"/>
      <h1>Employees List</h1>
      <table class="table-bordered">
        <tr>
          <th>Employee Name</th>
          <th>Gender</th>
          <th>Salary</th>
          <th>Date of joining</th>
          <th>Appraisal</th>
          <th>Description</th>
        </tr>
        <tr *ngFor="let  employeeObj of employeeArr">
          <td>{{employeeObj.employeeName|gender:employeeObj.gender|uppercase}}</td>
          <td>{{employeeObj.gender}}</td>
          <td>{{employeeObj.employeeSalary|currency:'INR'}}</td>
          <td>{{employeeObj.employeeDOJ|date:"fullDate"|uppercase}}</td>
          <td>{{employeeObj.employeeAppraisal|percent:'4.3-5'}}</td>
          <td>{{employeeObj.employeeDesc|slice:5:15}}</td>
        </tr>
      </table>
    </div>
  `,
  styles: []
})
export class EmployeeComponent implements OnInit {

  filterCriteria:any='';
  employeeArr:any=[
    {
      'employeeName':'Divya Garg',
      'employeeDesc':'Divya is a Technical Trainer having corporate and retail',
      'employeeSalary':85000,
      'gender':'Female',
      'employeeDOJ':new Date(2019,4,20),
      'employeeAppraisal':1.3495
      },
      {
        'employeeName':'Bhoomika Hastir',
        'employeeDesc':'Bhoomika is into HR',
        'employeeSalary':55000,
        'gender':'Female',
        'employeeDOJ':new Date(2013,6,10),
        'employeeAppraisal':1.3495
        },
        {
          'employeeName':'Uttam Sudan',
          'employeeDesc':'Uttam is a Saleforce Senior Trainer',
          'employeeSalary':105000,
          'gender':'Male',
          'employeeDOJ':new Date(2013,6,10),
          'employeeAppraisal':1.3495
          }
  ];

  
  constructor() { }

  ngOnInit() {
  }

}
