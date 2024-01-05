package com.customerservice.services.impl;

import com.customerservice.converters.AddressConverter;
import com.customerservice.converters.CustomerConverter;
import com.customerservice.dtos.AddressDto;
import com.customerservice.dtos.CustomerDto;
import com.customerservice.entities.Address;
import com.customerservice.entities.Customer;
import com.customerservice.enums.ErrorConstant;
import com.customerservice.exceptions.CustomerNotFoundException;
import com.customerservice.repositories.CustomerRepository;
import com.customerservice.services.AddressService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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
    public CustomerDto updateAddress(UUID externalId, AddressDto addressDto) {
        Customer customer = customerRepo.findById(externalId).orElseThrow(() -> new CustomerNotFoundException(ErrorConstant.CUSTOMER_NOT_FOUND));
        List<Address> addressList = new ArrayList<>();
        addressList.add(addressConverter.DtoToEntity(addressDto));
        customer.setAddress(addressList);
        return customerConverter.entityToDto(customerRepo.save(customer));

    }
}

