import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'gender'
})
export class GenderPipe implements PipeTransform {

  transform(value: string, param:string): string {
    if(param.toLowerCase()=='male'){
      return "Mr. "+value;
    }
    return "Miss. "+value;
  }

}
