import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-info',
  templateUrl: './info.component.html',
  styleUrl: './info.component.css'
})
export class InfoComponent {
  @Input("info") information:string=""
  @Input("aclass") alerttheme=""

  @Output() senseit:EventEmitter<string>=new EventEmitter<string>();

  communicate()
  {
     this.senseit.emit(this.information)
  }
}
