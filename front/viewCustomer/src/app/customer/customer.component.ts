import { Component, OnInit } from '@angular/core';
import { CustomerService } from 'src/services/customerService';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {

  customers : any[];

  constructor(private customerService : CustomerService) { }

  ngOnInit(): void {
    this.customers = this.customerService.customers;
  }

}
