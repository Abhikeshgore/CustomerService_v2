package com.customerservice.controllers;
import java.util.UUID;

import com.customerservice.dtos.AddressDto;
import io.swagger.annotations.ApiParam;
import jakarta.validation.Valid;


import com.customerservice.dtos.CustomerDto;
import com.customerservice.services.AddressService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer/{id}/address")
public class AddressController {

    private AddressService addressService;
    public AddressController(AddressService addressService)
    {
        this.addressService=addressService;

    }

    @PutMapping
    public CustomerDto updateAddress(@PathVariable(name = "id") @ApiParam(value = "customerID")
                                     UUID customer_id,@Valid @RequestBody AddressDto address){
        return addressService.updateAddress(customer_id,address);

    }
}
