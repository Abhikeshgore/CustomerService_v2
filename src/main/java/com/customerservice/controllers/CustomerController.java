package com.customerservice.controllers;

import com.customerservice.dtos.CustomerDto;
import com.customerservice.services.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.UUID;


@RestController
@RequestMapping("/customers")
@Tag(name = "CustomerController",description = "To perform operation on Customers")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService)
    {
        this.customerService = customerService;
    }
    @Operation(
            summary = "POST operation on Customer",
            description = "It is used to save customer object in database"
    )
    @PostMapping
    public CustomerDto addCustomer(@Valid @RequestBody CustomerDto customer)
    {
        return customerService.addCustomer(customer);

    }

    @Operation(
            summary = "GET operation on Customer",
            description = "It is used to retrieve customer object in database using customer id"
     )
    @GetMapping("/{externalId}")
    public CustomerDto getCustomerById(@PathVariable @Parameter(name = "externalId",example = "7e056083-752e-44fb-9de4-409e83aecc6c") UUID externalId)
    {
        return customerService.getCustomerById(externalId);


    }


}
