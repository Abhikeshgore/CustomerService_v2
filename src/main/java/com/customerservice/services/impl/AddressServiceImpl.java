package com.customerservice.services.impl;

import com.customerservice.converters.AddressConverter;
import com.customerservice.converters.CustomerConverter;
import com.customerservice.dtos.AddressDto;
import com.customerservice.dtos.CustomerDto;
import com.customerservice.entities.Customer;
import com.customerservice.enums.ErrorConstant;
import com.customerservice.exceptions.CustomerNotFoundException;
import com.customerservice.repositories.CustomerRepository;
import com.customerservice.services.AddressService;
import org.springframework.stereotype.Service;

import java.util.UUID;

//import java.util.UUID;

@Service
public class AddressServiceImpl  implements AddressService {
    private CustomerRepository customerRepo;
    private CustomerConverter customerConverter;
    private AddressConverter addressConverter;

    public AddressServiceImpl(CustomerRepository customerRepo,CustomerConverter customerConverter
            ,AddressConverter addressConverter)
    {
        this.customerRepo=customerRepo;
        this.customerConverter=customerConverter;
        this.addressConverter=addressConverter;

    }

    @Override
    public CustomerDto updateAddress(UUID id, AddressDto addressDto) {
        Customer customer = customerRepo.findById(id).orElseThrow(() -> new CustomerNotFoundException(ErrorConstant.CUSTOMER_NOT_FOUND));
        customer.setAddress(addressConverter.DtoToEntity(addressDto));
        return customerConverter.entityToDto(customerRepo.save(customer));

    }
}
