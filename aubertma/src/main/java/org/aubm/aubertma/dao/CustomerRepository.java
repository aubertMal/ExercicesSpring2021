package org.aubm.aubertma.dao;

import org.aubm.aubertma.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    
}
