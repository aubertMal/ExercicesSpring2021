package org.aubm.aubertma.controller;

import org.aubm.aubertma.entity.Customer;
import org.aubm.aubertma.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class ViewController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/view")
    public List<Customer> getCustomers(){
        System.out.println("got the request!!!!");
        return customerService.getCustomers();
    }

}
