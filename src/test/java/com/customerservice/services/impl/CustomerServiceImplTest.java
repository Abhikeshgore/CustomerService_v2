package com.customerservice.services.impl;

import com.customerservice.converters.CustomerConverter;
import com.customerservice.dtos.CustomerDto;
import com.customerservice.entities.Customer;
import com.customerservice.repositories.CustomerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;
import java.util.UUID;

import static org.mockito.Mockito.when;

public class CustomerServiceImplTest {
    @InjectMocks
    private CustomerServiceImpl customerService;
    @Mock
    private CustomerRepository customerRepository;
    @Mock
    private CustomerConverter customerConverter;
    private Customer customer;
    private CustomerDto customerDto;
    private String externalId;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        customerDto =new CustomerDto();
        customerDto.setFirstName("Abhay");
        customerDto.setLastName("Gore");
        customer=new Customer();
        customer.setFirstName("Abhay");
        customer.setLastName("Gore");
        externalId= UUID.randomUUID().toString();

    }

    @Test
    public void testAddCustomer(){
        when(customerConverter.dtoToEntity(customerDto)).thenReturn(customer);
        when(customerRepository.save(customer)).thenReturn(customer);
        when(customerConverter.entityToDto(customer)).thenReturn(customerDto);

        CustomerDto addedCustomer = customerService.addCustomer(customerDto);
        Assertions.assertEquals(addedCustomer.getFirstName(),customer.getFirstName());

    }
    @Test
    public void testGetCustomerById(){
        Optional<Customer> optionalCustomer = Optional.of(customer);
        when(customerRepository.findByExternalId(externalId)).thenReturn(optionalCustomer);
        when(customerConverter.entityToDto(customer)).thenReturn(customerDto);
        Assertions.assertEquals(customerService.getCustomerById(externalId).getFirstName(),customer.getFirstName());
    }

}
