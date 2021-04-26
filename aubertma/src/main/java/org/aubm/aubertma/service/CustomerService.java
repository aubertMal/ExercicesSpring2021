package org.aubm.aubertma.service;

import org.aubm.aubertma.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CustomerService {

    private List<Customer> customerList= Collections.emptyList();

    public List<Customer> getCustomers(){

        return customerList;
    }

    public Customer getCustomerById(int id){
        Customer customToReturn=null;
        for (Customer custom:
             customerList) {
            if (custom.getId()==id)
                customToReturn = custom;
        }
        return customToReturn;
    }

    public void addCustomer(Customer newCustomer){
        customerList.add(newCustomer);
    }

    public void updateCustomer (int id, Customer newCustomer){
        for (Customer custom:
                customerList) {
            if (custom.getId()==id)
                custom.setName(newCustomer.getName());
        }
    }

    public void removeCustomer (int id){
        customerList.remove(getCustomerById(id));
    }
}
