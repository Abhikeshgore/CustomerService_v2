package com.customerservice.controllers;

import com.customerservice.dtos.CustomerDto;
import com.customerservice.entities.Customer;
import com.customerservice.services.CustomerService;
import jakarta.validation.Valid;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.ApiParam;

import java.util.UUID;

@RestController
@RequestMapping("/customers")

public class CustomerController {
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

    @GetMapping
    public CustomerDto getCustomerById(@PathVariable @ApiParam(value = "customerId",example = "6ace0d48-43ee-459c-ad80-6c1efd077ebb")UUID id){
        return customerService.getCustomerById(id);


    }


}
