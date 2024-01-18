package com.customerservice.controllers;


import com.customerservice.dtos.AddressDto;

import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;


import com.customerservice.dtos.CustomerDto;
import com.customerservice.services.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/customers/{id}/addresses")
public class AddressController {

    private AddressService addressService;
    public AddressController(AddressService addressService)
    {
        this.addressService=addressService;

    }

    @PutMapping
    public CustomerDto updateAddress(@PathVariable(name = "externalId") @Parameter(name = "customerID")
                                     UUID externalId, @Valid @RequestBody AddressDto address){
        return addressService.updateAddress(externalId,address);

    }
}
