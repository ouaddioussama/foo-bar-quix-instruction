import { Component, OnInit, OnDestroy } from '@angular/core';
import { FooBarQuixService } from '../foo-bar-quix.service';
import { Result } from '../model/result';

@Component({
  selector: 'app-foo-bar-quix',
  templateUrl: './foo-bar-quix.component.html'
})
export class FooBarQuixComponent implements OnInit, OnDestroy {

  resultConversion =<Result>{};
  dataResult :Array<NumberConverted>=[]


  constructor(private fooBarQuixService: FooBarQuixService) { }

    ngOnInit(): void {
    }

    ngOnDestroy(): void {
    }


  convertNumber(inputNumber:number):void{
    this.fooBarQuixService.getConvertedNumber(inputNumber)
    .subscribe(
        (data:any) =>{
          this.dataResult.push({"numberToConvert":inputNumber,"result":data.result });
        },
        (error) =>  console.log(error)
    )
  }

}



interface NumberConverted {
  numberToConvert: number;
  result: string;
}
