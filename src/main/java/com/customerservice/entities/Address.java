package com.customerservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer address_id;

    //changes here

    @Column(unique = true)
    private String externalAddress_Id;

    @PrePersist
    public void prePersist() {
        this.externalAddress_Id = UUID.randomUUID().toString();
    }
    //end

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