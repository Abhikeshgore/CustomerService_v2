package com.customerservice.entities;

import com.customerservice.enums.Gender;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.*;

@Entity
@Data
@Table(name ="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
//    private Integer customer_id;

    @Column(unique = true)
    private String externalId; //External UUID

    @PrePersist
    public void prePersist()
    {
        this.externalId= UUID.randomUUID().toString();
    }



    @Column(name = "firstname")
    private String firstName;


    @Column(name = "lastname")
    private String lastName;


    @Column(name = "age")
    private int age;

//   @NotEmpty(message = "Mandatory")
   @Enumerated(EnumType.STRING)
    private Gender gender;

//   @Column (name="address_id")
//   private Integer address_id;


    @OneToMany(targetEntity = Address.class ,cascade =  CascadeType.ALL)
    @JoinColumn(name = "ca_fk",referencedColumnName = "id")
    @JsonIgnoreProperties("customer")
    private List<Address> address;

    @CreationTimestamp
    @Column(name ="creation_time")
    private LocalDateTime createdTime;

    @UpdateTimestamp
    @Column(name = " update_time")
    private LocalDateTime updateTime;


}


