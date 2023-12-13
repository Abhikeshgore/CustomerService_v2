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
    @Column(name="house_number")
    private String houseNumber;

    @Column(name="street")
    private String street;

    @Column(name="city")
    private String city;

    @Column(name="province")
    private String province;

    @Column(name="country")
    private String country;

    @Column(name="pincode")
    private String pincode;


}