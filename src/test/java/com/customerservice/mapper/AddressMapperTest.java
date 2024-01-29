package com.customerservice.mapper;

import com.customerservice.dtos.AddressDto;
import com.customerservice.entities.Address;
import com.customerservice.entities.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class AddressMapperTest {
    @InjectMocks
    private AddressMapperImpl addressMapper;
    private Address address;
    private Customer customer;
    private AddressDto addressDto;

    @BeforeEach
    public void setUp()
    {
        MockitoAnnotations.initMocks(this);
        address=new Address();
        address.setCity("Latur");
        address.setCountry("India");
        addressDto =new AddressDto();
        addressDto.setCity("Latur");
        addressDto.setCountry("India");
    }
    @Test
    public void testDtoToEntity()
    {
        Assertions.assertEquals(addressMapper.dtoToEntity(addressDto).getCity(),"Latur");
    }

}
