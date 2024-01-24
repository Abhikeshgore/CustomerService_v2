//package com.customerservice.converters;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import com.customerservice.dtos.CustomerDto;
//import com.customerservice.entities.Address;
//import com.customerservice.entities.Customer;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CustomerConverter {
//
//    public CustomerDto entityToDto(Customer customer)
//    {
//        CustomerDto customerDto = new CustomerDto();
//        //changes here
//        customerDto.setExternalId(customer.getExternalId());
//        customerDto.setFirstName(customer.getFirstName());
//        customerDto.setLastName(customer.getLastName());
//        customerDto.setAge(customer.getAge());
//        //changed here
////        customerDto.setCustomer_id((customer.getCustomer_id()));
//       customerDto.setId(customer.getId());
//
//        customerDto.setGender(customer.getGender());
//        //changes here
//        //customerDto.setCurrentAddress((Address) customer.getAddress());
//        customerDto.setCurrentAddress(customer.getCurrentAddress());
//        return  customerDto;
//
//    }
//    public List<CustomerDto> entityToDto(List<Customer> customers)
//    {
//        return customers.stream().map(customer -> entityToDto(customer)).collect(Collectors.toList());
//
//    }
//
//
//    public Customer dtoToEntity(CustomerDto customerDto)
//    {
//        Customer customer=new Customer();
//        //changes here
//        customer.setExternalId(customerDto.getExternalId());
//        customer.setFirstName(customerDto.getFirstName());
//        customer.setLastName(customerDto.getLastName());
//        customer.setAge(customerDto.getAge());
//        //changed here
////        customer.setCustomer_id(customerDto.getCustomer_id());
//        customer.setId(customerDto.getId());
//        customer.setGender(customerDto.getGender());
//        customer.setCurrentAddress((List<Address>) customerDto.getCurrentAddress());
//        return customer;
//    }
//
//    public List<Customer> dtoToEntity(List<CustomerDto> customerDtos)
//    {
//        return customerDtos.stream().map(customerDto -> dtoToEntity(customerDto)).collect(Collectors.toList());
//    }
//
//}
