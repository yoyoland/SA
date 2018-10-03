import { Component, OnInit } from '@angular/core';
export interface Food {
  value: string;
  viewValue: string;
}
@Component({
  selector: 'app-report',
  templateUrl: './report.component.html',
  styleUrls: ['./report.component.css']
})

export class ReportComponent implements OnInit {
  foods: Food[] = [
    {value: 'รอส่ง-0', viewValue: 'รอส่ง'},
    {value: 'กำลังส่ง-1', viewValue: 'กำลังส่ง'}
  ];

  constructor() { }

  ngOnInit() {
  }



}
