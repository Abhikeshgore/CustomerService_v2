package com.customerservice.entities;

import com.customerservice.enums.Gender;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
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

    @Column(name ="externalId",unique = true)
    private String externalId;

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


   @Enumerated(EnumType.STRING)
    private Gender gender;



    @OneToMany(targetEntity = Address.class ,cascade =  CascadeType.ALL)
    @JoinColumn(name = "ca_fk",referencedColumnName = "id")
    @JsonIgnoreProperties("customer")
    private List<Address> currentAddress;

    @CreationTimestamp
    @Column(name ="creation_Time")
    private LocalDateTime createdTime;

    @UpdateTimestamp
    @Column(name = " update_Time")
    private LocalDateTime updateTime;


}


