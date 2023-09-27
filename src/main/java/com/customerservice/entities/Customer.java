package com.customerservice.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name ="customer")
public class Customer {
    @Id
    @GeneratedValue
    @Column(name = "customer_id")
    private UUID customerId;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "age")
    private int age;

    @Embedded
    private Address address;

    @CreationTimestamp
    @Column(name ="creation_time")
    private LocalDateTime createdTime;

    @UpdateTimestamp
    @Column(name = " update_time")
    private LocalDateTime updateTime;

    @Version  /* This field will be used for optimistic locking */
    private Integer version;
}


