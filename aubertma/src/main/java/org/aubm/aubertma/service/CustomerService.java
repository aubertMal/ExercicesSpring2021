package org.aubm.aubertma.service;

import org.aubm.aubertma.dao.CustomerRepository;
import org.aubm.aubertma.entity.City;
import org.aubm.aubertma.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomers(){

        return customerRepository.findAll();
    }

    public Customer getCustomerById(int id){
        return customerRepository.findById(id);
    }

    public void addCustomer(Customer newCustomer){
        try {
            newCustomer.setCity(getCity(newCustomer.getCodeINSEE()).getNom());
        } catch (RestClientException e){
            System.out.println("La recherche n'a pas abouti!");
        }
        customerRepository.save(newCustomer);
    }

    public City getCity(String code){

        RestTemplate restTemplate = new RestTemplate();
       City response
                = restTemplate.getForObject("https://geo.api.gouv.fr/communes/"+code+"?fields=nom,&format=json&geometry=centre", City.class);
        return response;
    }

    public void updateCustomer (int id, Customer newCustomer){
        Customer customer = customerRepository.findById(id);
        if (customer != null)
            customerRepository.save(customer);
    }

    public void removeCustomer (int id){
        customerRepository.deleteById(id);
    }
}
