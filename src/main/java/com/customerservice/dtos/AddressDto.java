package com.customerservice.dtos;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddressDto {
//    @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer address_id;
    private String externalAddress_Id;
    private String houseNumber;
    private String street;
    private String city;
    private String province;
    private String country;
    private String pincode;
    private String nationality;

}
