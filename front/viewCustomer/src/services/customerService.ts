import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Customer } from "src/app/models/Customer";

@Injectable()
export class CustomerService{
    customer = new Customer(1, 'Alex','37261');
    customers : Customer[];
        

    constructor(private httpClient : HttpClient){}

    addCustomer() {
        this.httpClient
          .post('localhost:8080', this.customer)
          .subscribe(
            () => {
              console.log('Enregistrement terminé !');
            },
            (error) => {
              console.log('Erreur ! : ' + error);
            }
          );
    }

    getCustomers() : Observable <Customer[]>{
        return this.httpClient.get<Customer[]>('http://localhost:8080/customers');
    }
}