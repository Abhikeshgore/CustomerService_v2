package com.customerservice.services;

import com.customerservice.dtos.CustomerDto;



public interface CustomerService {
        CustomerDto addCustomer(CustomerDto customerDto);

        CustomerDto getCustomerById(Integer id);

}
