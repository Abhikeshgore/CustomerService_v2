package com.customerservice.services.impl;

import com.customerservice.dtos.AddressDto;
import com.customerservice.dtos.CustomerDto;
import com.customerservice.entities.Address;
import com.customerservice.entities.Customer;
import com.customerservice.enums.ErrorConstant;
import com.customerservice.exceptions.CustomerNotFoundException;
import com.customerservice.mapper.AddressMapper;
import com.customerservice.mapper.CustomerMapper;
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

    private CustomerMapper customerMapper;
    private AddressMapper addressMapper;

    public AddressServiceImpl(CustomerRepository customerRepo,CustomerMapper customerMapper,AddressMapper addressMapper)
    {
        this.customerRepo=customerRepo;
//        this.customerConverter=customerConverter;
//        this.addressConverter=addressConverter;
        this.customerMapper=customerMapper;
        this.addressMapper=addressMapper;

    }

    @Override
    public CustomerDto updateAddress(UUID externalId, AddressDto addressDto) {
        Customer customer = customerRepo.findById(externalId).orElseThrow(() -> new CustomerNotFoundException(ErrorConstant.CUSTOMER_NOT_FOUND));
        List<Address> addressList = new ArrayList<>();
//        addressList.add(addressConverter.DtoToEntity(addressDto));
        addressList.add(addressMapper.dtoToEntity(addressDto));
        customer.setCurrentAddress(addressList);
        //customer.setAddress(addressList);
//       customer.setCurrentAddress(addressList);
//       return customerConverter.entityToDto(customerRepo.save(customer));
        return  customerMapper.entityToDto(customerRepo.save(customer));

    }
}

