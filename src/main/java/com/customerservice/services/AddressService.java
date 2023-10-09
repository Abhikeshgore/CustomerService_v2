package com.customerservice.services;

import com.customerservice.dtos.AddressDto;
import com.customerservice.dtos.CustomerDto;

import java.util.UUID;

public interface AddressService {
    CustomerDto updateAddress(UUID customer_id, AddressDto addressDto);
}
