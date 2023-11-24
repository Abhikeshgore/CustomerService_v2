package com.customerservice.services;

import com.customerservice.dtos.AddressDto;
import com.customerservice.dtos.CustomerDto;



public interface AddressService {
    CustomerDto updateAddress(Integer id, AddressDto addressDto);
}
