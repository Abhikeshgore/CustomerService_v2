package com.customerservice.entities;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data@Embeddable
public class Address {

    private String houseNumber;
    private String street;
    private String city;
    private String province;
    private String country;
    private String pincode;

}