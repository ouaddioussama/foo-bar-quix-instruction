import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-foo-bar-quix-form',
  templateUrl: './foo-bar-quix-form.component.html'
})
export class FooBarQuixFormComponent implements OnInit {

  @Output() submitNumberOutput = new EventEmitter<string>();

   inputNumber :string=''

     ngOnInit(): void {
     }

  submitNumber(): void {
      this.submitNumberOutput.emit(this.inputNumber);
      this.inputNumber=''

  }

}
