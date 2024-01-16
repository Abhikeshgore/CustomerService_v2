package com.customerservice.controllers;

import com.customerservice.dtos.CustomerDto;
import com.customerservice.entities.Customer;
import com.customerservice.repositories.CustomerRepository;
import com.customerservice.services.impl.CustomerServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class CustomerControllerTest {
    @Mock
    private CustomerRepository customerRepository;
    @Mock
    private CustomerServiceImpl customerService;
    @InjectMocks
    private CustomerController customerController;
    CustomerDto customerDto;
    String externalId;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        customerDto =new CustomerDto();
        customerDto.setFirstName("Abhay");
        customerDto.setLastName("Gore");
        externalId= UUID.randomUUID().toString();

    }
    @Test
    public void testAddCustomer(){
        when(customerService.addCustomer(customerDto)).thenReturn(customerDto);
        //assertThat(customerController.addCustomer(customerDto).getFirstName()).isEqualTo("Abhay");
        Assertions.assertEquals(customerController.addCustomer(customerDto).getFirstName(),"Abhay");
        
    }

    @Test
    public void testGetCustomerById(){
        //Optional<Customer> optionalCustomer=Optional.empty();
        when(customerService.getCustomerById(externalId)).thenReturn(customerDto);
        Assertions.assertEquals(customerController.getCustomerById(externalId).getFirstName(),"Abhay");
    }
}
