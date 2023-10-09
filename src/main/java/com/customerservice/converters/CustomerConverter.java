package com.customerservice.converters;
import java.util.List;
import java.util.stream.Collectors;

import com.customerservice.dtos.CustomerDto;
import com.customerservice.entities.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerConverter {

    public CustomerDto entityToDto(Customer customer)
    {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setFirstName(customer.getFirstName());
        customerDto.setLastName(customer.getLastName());
        customerDto.setAge(customer.getAge());
        customerDto.setCustomerId(customer.getCustomerId());
        customerDto.setGender(customer.getGender());
        customerDto.setCurrentAddress(customer.getAddress());
        return  customerDto;

    }
    public List<CustomerDto> entityToDto(List<Customer> customers)
    {
        return customers.stream().map(customer -> entityToDto(customer)).collect(Collectors.toList());

    }


    public Customer dtoToEntity(CustomerDto customerDto)
    {
        Customer customer=new Customer();
        customer.setFirstName(customerDto.getFirstName());
        customer.setFirstName(customerDto.getLastName());
        customer.setAge(customerDto.getAge());
        customer.setCustomerId(customerDto.getCustomerId());
        customer.setGender(customerDto.getGender());
        customer.setAddress(customerDto.getCurrentAddress());
        return customer;
    }

    public List<Customer> dtoToEntity(List<CustomerDto> customerDtos)
    {
        return customerDtos.stream().map(customerDto -> dtoToEntity(customerDto)).collect(Collectors.toList());
    }

}
