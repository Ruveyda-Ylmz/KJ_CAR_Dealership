package com.ruveyda.service;

import com.ruveyda.dto.request.OrderRequestDto;
import com.ruveyda.entity.Address;
import com.ruveyda.entity.Customer;
import com.ruveyda.entity.Order;
import com.ruveyda.repository.AddressRepository;
import com.ruveyda.repository.CustomerRepository;
import com.ruveyda.repository.OrderRepository;
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
