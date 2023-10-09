package com.customerservice.dtos;

import com.customerservice.entities.Address;
import com.customerservice.enums.Gender;
import jakarta.validation.Valid;
import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.util.UUID;

@Data
public class CustomerDto {
    private UUID customerId;
    @NotBlank(message ="Firstname is mandatory")
    private String firstName;
    @NotBlank(message ="LastName is mandatory")
    private String lastName;
    @Positive(message = "Age should be greater than 0")
    private int age;
    @NotBlank(message = "Gender is mandatory")
    private Gender gender;
    @NotNull(message = "Address is mandatory")
    @Valid
    private Address currentAddress;




}
