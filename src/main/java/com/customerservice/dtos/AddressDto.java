package com.customerservice.dtos;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddressDto {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
    private String externalAddress_Id;

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
