package com.ruveyda.service;

import com.ruveyda.entity.Customer;
import com.ruveyda.repository.CustomerRepository;
import com.ruveyda.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends ServiceManager<Customer,Long> {

    private final CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {
        super(customerRepository);
        this.customerRepository = customerRepository;
    }
}
