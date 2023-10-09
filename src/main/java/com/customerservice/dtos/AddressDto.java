package com.customerservice.dtos;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddressDto {
    @NotBlank(message="House number is mandatory")
    private String houseNumber;
    @NotBlank(message="Street is mandatory")
    private String street;
    @NotBlank(message="City is mandatory")
    private String city;
    @NotBlank(message="Province is mandatory")
    private String province;
    @NotBlank(message="Country is mandatory")
    private String country;
    @NotBlank(message="Pincode is mandatory")
    private String pincode;

}
