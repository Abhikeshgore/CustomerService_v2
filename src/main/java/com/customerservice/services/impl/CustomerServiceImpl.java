package com.customerservice.services.impl;

import com.customerservice.converters.CustomerConverter;
import com.customerservice.dtos.CustomerDto;
import com.customerservice.entities.Customer;
import com.customerservice.enums.ErrorConstant;
import com.customerservice.exceptions.CustomerNotFoundException;
import com.customerservice.repositories.CustomerRepository;
import com.customerservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepo;
    @Autowired
    private CustomerConverter customerConverter;

    public CustomerServiceImpl(CustomerRepository customerRepo,CustomerConverter customerConverter){
        this.customerRepo=customerRepo;
        this.customerConverter=customerConverter;

    }

    @Override
    public CustomerDto addCustomer(CustomerDto customerDto) {
        Customer customer = customerConverter.dtoToEntity(customerDto);
       // Gender.valueOf();

        return  customerConverter.entityToDto(customerRepo.save(customer)) ;
    }

    @Override
    public CustomerDto getCustomerById(UUID externalId) {

        Customer customer= customerRepo.findByExternalId(externalId.toString())
                .orElseThrow(()->new CustomerNotFoundException(ErrorConstant.CUSTOMER_NOT_FOUND));

        return customerConverter.entityToDto(customer);
    }
}
