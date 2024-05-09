package com.ruveyda.service;

import com.ruveyda.entity.Address;
import com.ruveyda.entity.Customer;
import com.ruveyda.repository.AddressRepository;
import com.ruveyda.repository.CustomerRepository;
import com.ruveyda.utility.ServiceManager;
import com.ruveyda.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class AddressService extends ServiceManager<Address,Long> {

    private final AddressRepository addressRepository;
    public AddressService(AddressRepository addressRepository) {
        super(addressRepository);
        this.addressRepository = addressRepository;
    }



}
