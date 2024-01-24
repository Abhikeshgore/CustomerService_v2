package com.customerservice.mapper;
import java.util.List;
import com.customerservice.dtos.CustomerDto;
import com.customerservice.entities.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CustomerMapper {
    CustomerDto entityToDto(Customer customer);

    Customer dtoToEntity(CustomerDto customerDto);

    List<CustomerDto> entityToDto(List<Customer> customers);

    List<Customer> dtoToEntity(List<CustomerDto> customerDtos);

    }
