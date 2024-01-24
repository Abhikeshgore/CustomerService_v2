package com.customerservice.mapper;

import com.customerservice.dtos.CustomerDto;
import com.customerservice.entities.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

public class CustomerMapperTest {
    @InjectMocks
    private CustomerMapperImpl customerMapper;
    private Customer customer;
    private CustomerDto customerDto;

    @BeforeEach
    public void setUp()
    {
        MockitoAnnotations.initMocks(this);
        customer =new Customer();
        customer.setFirstName("Abhay");
        customer.setLastName("Gore");
        customerDto =new CustomerDto();
        customerDto.setFirstName("Abhay");
        customerDto.setLastName("Gore");
    }
    @Test
    public void testEntityToDto()
    {
        Assertions.assertEquals(customerMapper.entityToDto(customer).getFirstName(),"Abhay");

    }

    @Test
    public void testEntityDtoForList()
    {
        List<Customer> customers=new ArrayList<>();
        customers.add(customer);
        Assertions.assertEquals(customerMapper.entityToDto(customers).size(),1);
    }
    @Test
    public void testDtoToEntity()
    {
        Assertions.assertEquals(customerMapper.dtoToEntity(customerDto).getFirstName(),"Abhay");
    }
    @Test
    public void testDtoToEntityList()
    {
        List<CustomerDto> customerDtos =new ArrayList<>();
        customerDtos.add(customerDto);
        Assertions.assertEquals(customerMapper.dtoToEntity(customerDtos).size(),1);
    }

}
