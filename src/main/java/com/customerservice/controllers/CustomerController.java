package com.customerservice.controllers;

import com.customerservice.dtos.CustomerDto;
import com.customerservice.entities.Customer;
import com.customerservice.services.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.ApiParam;

import java.util.UUID;


@RestController
@RequestMapping("/customers")

public class CustomerController {
    @Autowired
    private CustomerService customerService;

    public CustomerController(CustomerService customerService)
    {
        this.customerService = customerService;
    }

    @PostMapping
    public CustomerDto addCustomer(@Valid @RequestBody CustomerDto customer)
    {
        return customerService.addCustomer(customer);

    }

    @GetMapping("/customers/{externalId}")
    public CustomerDto getCustomerById(@PathVariable @ApiParam(value = "externalId",example = "7e056083-752e-44fb-9de4-409e83aecc6c") UUID externalId)
    {
        return customerService.getCustomerById(externalId);


    }


}
