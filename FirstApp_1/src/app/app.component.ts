import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styles: [`h1 { font-weight: bold;color:blue }  h2 { font-weight: bold;color:red }
  `],
  styleUrls:['./app.component.css']
})
export class AppComponent {
  title = 'Iris Software';
  isValid=true;
  projectsList=[
    {
      'projectId':'P101',
      'projectName':'Citi'
    },
    {
      'projectId':'P102',
      'projectName':'RBC'
    },
    {
      'projectId':'P103',
      'projectName':'ABC'
    },
    {
      'projectId':'P104',
      'projectName':'XYZ'
    },
    {
      'projectId':'P105',
      'projectName':'DEF'
    }
  ];

  changeVal(inp:any){
    this.isValid=inp;
  }
  addNewRow(pId:any,pName:any){
    let project={
      'projectId':pId,
      'projectName':pName
    };
    this.projectsList.push(project);
  }

  removeRow(pId:any){
    for(let i=0;i<this.projectsList.length;i++){
      if(this.projectsList[i].projectId==pId){
        this.projectsList.splice(i,1);
      }
    }
  }
  
  person = 'Sohan';
	ids = [1,2,3,4];
 
  countryDetails:any[]=[
    {
      'country':'India',
      'people':[
        {'name':'Ram'},
        {'name':'Shyam'},
        {'name':'Krishna'}
      ]
    },
    {
      'country':'UK',
      'people':[
        {'name':'Kathy'},
        {'name':'Harry'},
        {'name':'Tom'},
        {'name':'Herbert'}
      ]
    }
  ];

  empFirstName:string='Divya';
  empLastName:string='Garg';
   a:number=10;
   b:number=20;
  imagePath:string="https://miro.medium.com/max/2800/1*J_-vtvcqV1-v14WqkPWhiQ.png";
  employerName:string='Iris Software';
  studentName:string='';
  changeName(name){
    this.studentName=name;
  }

  userName:string='Chandan Sharma';

  changeUserName(eObj){
    this.userName=eObj.target.value;
  }

}
