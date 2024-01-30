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
    @NotBlank(message="House number is mandatory")
    private String houseNumber;
    @Column(name="street")
    @NotBlank(message="Street is mandatory")
    private String street;
    @Column(name="city")
    @NotBlank(message="City is mandatory")
    private String city;
    @Column(name="province")
    @NotBlank(message="Province is mandatory")
    private String province;
    @Column(name="country")
    @NotBlank(message="Country is mandatory")
    private String country;
    @Column(name="pincode")
    @NotBlank(message="Pincode is mandatory")
    private String pincode;


}