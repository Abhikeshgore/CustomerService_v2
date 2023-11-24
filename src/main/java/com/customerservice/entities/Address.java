package com.customerservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Mandatory")
    @Column(name="house_number")
    private String houseNumber;
    @NotBlank(message = "Mandatory")
    @Column(name="street")
    private String street;
    @NotBlank(message = "Mandatory")
    @Column(name="city")
    private String city;
    @NotBlank(message = "Mandatory")
    @Column(name="province")
    private String province;
    @NotBlank(message = "Mandatory")
    @Column(name="country")
    private String country;
    @NotBlank(message = "Mandatory")
    @Column(name="pincode")
    private String pincode;


}