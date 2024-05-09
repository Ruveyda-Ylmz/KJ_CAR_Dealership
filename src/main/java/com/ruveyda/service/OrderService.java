package com.ruveyda.service;

import com.ruveyda.dto.OrderRequestDto;
import com.ruveyda.entity.Address;
import com.ruveyda.entity.Address_Customer;
import com.ruveyda.entity.Customer;
import com.ruveyda.entity.Order;
import com.ruveyda.mapper.AddressMapper;
import com.ruveyda.mapper.CustomerMapper;
import com.ruveyda.mapper.OrderMapper;
import com.ruveyda.repository.OrderRepository;
import com.ruveyda.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends ServiceManager<Order,Long> {
    private final OrderRepository orderRepository;
    private final CustomerService customerService;
    private final AddressService addressService;
    private final Address_CustomerService addressCustomerService;


    public OrderService(OrderRepository orderRepository, CustomerService customerService, AddressService addressService, Address_CustomerService addressCustomerService) {
        super(orderRepository);
        this.orderRepository = orderRepository;
        this.customerService = customerService;
        this.addressService = addressService;
        this.addressCustomerService = addressCustomerService;
    }

    public Order newOrder(OrderRequestDto dto){
        Address address = AddressMapper.INSTANCE.fromOrderRequestToAddress(dto);
        Customer customer = CustomerMapper.INSTANCE.fromOrderRequestToCustomer(dto);
        customerService.save(customer);
        address.setCountryId(1L);
        addressService.save(address); //TODO Address,countryId düzenlenecek.
        addressCustomerService.save(Address_Customer.builder()
                .addressId(address.getId()).customerId(customer.getId()).build());
        Order order = OrderMapper.INSTANCE.fromOrderRequestToOrder(dto);
        order.setCustomerId(customer.getId());
        order.setAddressId(customer.getId());
        return save(order);
    }

    //4 electric, 2 hybrid, 10 ICE car.
}
