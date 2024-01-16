package com.customerservice.services;

import com.customerservice.dtos.CustomerDto;

import java.util.UUID;


public interface CustomerService {
        CustomerDto addCustomer(CustomerDto customerDto);

        CustomerDto getCustomerById(String externalId);

}
