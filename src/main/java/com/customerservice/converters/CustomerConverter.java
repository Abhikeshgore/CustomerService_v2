package com.customerservice.converters;
import java.util.List;
import java.util.stream.Collectors;

import com.customerservice.dtos.CustomerDto;
import com.customerservice.entities.Address;
import com.customerservice.entities.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerConverter {

    public CustomerDto entityToDto(Customer customer)
    {
        CustomerDto customerDto = new CustomerDto();
       // customerDto.setExternalId(customer.getExternalId());
        customerDto.setFirstName(customer.getFirstName());
        customerDto.setLastName(customer.getLastName());
        customerDto.setAge(customer.getAge());
        customerDto.setId(customer.getId());
        customerDto.setGender(customer.getGender());
        customerDto.setCurrentAddress((Address) customer.getAddress());
        return  customerDto;

    }
    public List<CustomerDto> entityToDto(List<Customer> customers)
    {
        return customers.stream().map(customer -> entityToDto(customer)).collect(Collectors.toList());

    }


    public Customer dtoToEntity(CustomerDto customerDto)
    {
        Customer customer=new Customer();
       // customer.setExternalId(customerDto.getExternalId());
        customer.setFirstName(customerDto.getFirstName());
        customer.setLastName(customerDto.getLastName());
        customer.setAge(customerDto.getAge());
        customer.setId(customerDto.getId());
        customer.setGender(customerDto.getGender());
        customer.setAddress((List<Address>) customerDto.getCurrentAddress());
        return customer;
    }

    public List<Customer> dtoToEntity(List<CustomerDto> customerDtos)
    {
        return customerDtos.stream().map(customerDto -> dtoToEntity(customerDto)).collect(Collectors.toList());
    }

}
