package com.ruveyda.service;

import com.ruveyda.entity.Address;
import com.ruveyda.entity.Address_Customer;
import com.ruveyda.repository.AddressRepository;
import com.ruveyda.repository.Address_CustomerRepository;
import com.ruveyda.utility.ServiceManager;
import com.ruveyda.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Address_CustomerService extends ServiceManager<Address_Customer,Long> {

    private final Address_CustomerRepository addressCustomerRepository;
    public Address_CustomerService(Address_CustomerRepository addressCustomerRepository) {
        super(addressCustomerRepository);
        this.addressCustomerRepository = addressCustomerRepository;
    }

    public Optional<Address_Customer> findByAddressIdAndCustomerId(Long addressId, Long customerId){
        return addressCustomerRepository.findByAddressIdAndCustomerId(addressId,customerId);
    }

    public Boolean doesAddressCustomerExists(Address_Customer addressCustomer){
        return addressCustomerRepository.existsByAddressIdAndCustomerId(addressCustomer.getAddressId(),addressCustomer.getCustomerId());
    }




}
