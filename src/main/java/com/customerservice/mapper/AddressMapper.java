package com.customerservice.mapper;

import com.customerservice.dtos.AddressDto;
import com.customerservice.entities.Address;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AddressMapper {
    Address dtoToEntity(AddressDto addressDto);


}
