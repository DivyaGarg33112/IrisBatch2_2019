import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'FourthApp-Routing';

  /*parent component which is app Component is having one property name which
  i want to share with my child component i.e. Test Component*/ 
  public name:string;
  
  
  public message="";
}
