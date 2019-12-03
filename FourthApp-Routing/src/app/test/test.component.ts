import { Component, OnInit, Input, Output,EventEmitter } from '@angular/core';


@Component({
  selector: 'app-test',
  template: `
    <h2>Welcome : {{pData}}</h2>
    <button (click)="fireEvent()">Sent Data from child to parent</button>
    `
})
export class TestComponent implements OnInit {
  //@Input() public parentsData;
  @Input('parentsData') public pData;

  //Creating an event to send data from child to parent
  @Output() public childEvent=new EventEmitter();

  constructor() { }

  ngOnInit() {
  }

  fireEvent(){
    this.childEvent.emit('Hey I m Data coming from Child');
  }
}
