package com.customerservice.converters;

import com.customerservice.dtos.AddressDto;
import com.customerservice.entities.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressConverter {
  public Address DtoToEntity(AddressDto addressDto)
  {
      Address address =new Address();
      address.setExternalAddress_Id(addressDto.getExternalAddress_Id());
      address.setHouseNumber(addressDto.getHouseNumber());
      address.setStreet(addressDto.getStreet());
      address.setCity(addressDto.getCity());
      address.setProvince(addressDto.getProvince());
      address.setCountry(addressDto.getCountry());
      address.setPincode(addressDto.getPincode());
      return address;



  }
}
