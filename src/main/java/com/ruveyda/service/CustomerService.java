package com.ruveyda.service;

import com.ruveyda.entity.Customer;
import com.ruveyda.repository.CustomerRepository;
import com.ruveyda.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService extends ServiceManager<Customer,Long> {

    private final CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {
        super(customerRepository);
        this.customerRepository = customerRepository;
    }

    public Optional<Customer> findByCustomerCitizenshipId(String customerCitizenshipId){
        return customerRepository.findOptionalByCustomerCitizenshipId(customerCitizenshipId);
    }

    public Boolean doesCustomerExist(Customer customer) {
        return customerRepository.existsByCustomerNameAndCustomerSurnameAndCustomerCitizenshipIdAndCustomersEmailAndCustomersPhoneNumber(
                customer.getCustomerName(), customer.getCustomerSurname(), customer.getCustomerCitizenshipId(),
                customer.getCustomersEmail(), customer.getCustomersPhoneNumber());
    }


}
