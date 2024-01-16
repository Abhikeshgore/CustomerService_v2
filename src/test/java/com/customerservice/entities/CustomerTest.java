package com.customerservice.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CustomerTest {
    Customer customer;

    @BeforeEach
    public void setUp()
    {
        customer =new Customer();

    }

    @Test
    public void testGetExternalId(){
        String externalId = UUID.randomUUID().toString();
        customer.setExternalId(externalId);
        Assertions.assertEquals(externalId,customer.getExternalId());

    }

    @Test
    public void testGetFirstName()
    {
        String firstName ="Anirudha";
        customer.setFirstName(firstName);
        Assertions.assertEquals(firstName,customer.getFirstName());

    }

    @Test
    public void testGetLastName()
    {
        String lastName ="Adekar";
        customer.setLastName((lastName));
        Assertions.assertEquals(lastName,customer.getLastName());
    }
    @Test
    public void testGetAge()
    {
        int age = 24;
        customer.setAge(age);
        Assertions.assertEquals(age,customer.getAge());
    }
    @Test
    public void testGetAddress(){
        List<Address> addresses= new ArrayList<>();
        Address address1 =new Address();
        address1.setCity("Latur");

        Address address2=new Address();
        address2.setCity("Pune");

        addresses.add(address1);
        addresses.add(address2);

        customer.setAddress(addresses);
        Assertions.assertEquals(addresses,customer.getAddress());

    }


    @Test
    public void testGetCreatedTime()
        {
            LocalDateTime creationTime = LocalDateTime.of(2024,1,16,8,5);
            customer.setCreatedTime(creationTime);
            Assertions.assertEquals(creationTime,customer.getCreatedTime());
        }

    @Test
    public void testGetUpdatedTime()
    {
        LocalDateTime updatedTime = LocalDateTime.of(2024,1,16,8,19);
        customer.setUpdateTime(updatedTime);
        Assertions.assertEquals(updatedTime,customer.getUpdateTime());
    }





}
