package com.customerservice.entities;

import com.customerservice.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;
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

    @NotNull
    @Column(name = "firstname")
    private String firstName;

    @NotNull
    @Column(name = "lastname")
    private String lastName;

    @NotNull
    @Column(name = "age")
    private int age;

   @NotNull
   @Enumerated(EnumType.STRING)
    private Gender gender;

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


