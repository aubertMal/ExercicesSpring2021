import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { CustomerComponent } from './customer/customer.component';
import { CustomerService } from 'src/services/customerService';

@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent
  ],
  imports: [
    HttpClientModule,
    BrowserModule
  ],
  providers: [
    CustomerService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
