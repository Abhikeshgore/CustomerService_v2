package com.customerservice.services.impl;

//import com.customerservice.converters.CustomerConverter;
import com.customerservice.dtos.CustomerDto;
import com.customerservice.entities.Customer;
import com.customerservice.enums.ErrorConstant;
import com.customerservice.exceptions.CustomerNotFoundException;
import com.customerservice.mapper.CustomerMapper;
import com.customerservice.repositories.CustomerRepository;
import com.customerservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepo;
//    private CustomerConverter customerConverter;
    private CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepo,CustomerMapper customerMapper){
        this.customerRepo=customerRepo;
//        this.customerConverter=customerConverter;
        this.customerMapper=customerMapper;

    }

    @Override
    public CustomerDto addCustomer(CustomerDto customerDto) {
//        Customer customer = customerConverter.dtoToEntity(customerDto);
          Customer customer= customerMapper.dtoToEntity(customerDto);
//        return  customerConverter.entityToDto(customerRepo.save(customer)) ;
          return  customerMapper.entityToDto(customerRepo.save(customer));
    }

    @Override
    public CustomerDto getCustomerById(String externalId) {

        Customer customer= customerRepo.findByExternalId(externalId.toString())
                .orElseThrow(()->new CustomerNotFoundException(ErrorConstant.CUSTOMER_NOT_FOUND));

//        return customerConverter.entityToDto(customer);
        return customerMapper.entityToDto(customer);
    }
}
