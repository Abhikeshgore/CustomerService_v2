package com.customerservice.dtos;

import com.customerservice.entities.Address;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.lang.*;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CustomerDtoTest {
    CustomerDto customerDto;
    @BeforeEach
     public void setUp()
     {
         customerDto =new CustomerDto();

     }

     @Test
     public void testGetExternalId()
     {
         String externalId = UUID.randomUUID().toString();
         customerDto.setExternalId(externalId);
         Assertions.assertEquals(externalId,customerDto.getExternalId());

     }
     @Test
    public void testGetFirstName()
     {
         String firstName ="Abhay";
         customerDto.setFirstName(firstName);
         Assertions.assertEquals(firstName,customerDto.getFirstName());

     }
     @Test
    public void testGetLastName()
     {
         String lastName="Gore";
         customerDto.setLastName(lastName);
         Assertions.assertEquals(lastName,customerDto.getLastName());
     }
     @Test
    public void testGetAge()
     {
         int age = 24;
         customerDto.setAge(age);
         Assertions.assertEquals(age,customerDto.getAge());

     }

     @Test
    public void testGetAddress(){
         List<Address> addresses = new ArrayList<>();
         Address address1 =new Address();
         address1.setHouseNumber("xyz");
         address1.setStreet("shaitan gali");
         address1.setCity("latur");
         address1.setProvince("marath");
         address1.setCountry("india");
         address1.setPincode("412312");

        Address address2 =new Address();
        address2.setHouseNumber("323");
        address2.setStreet("Mainroad");
        address2.setCity("mahabaleshwar");
        address2.setProvince("mahara");
        address2.setCountry("india");
        address2.setPincode("2342");

        addresses.add(address1);
        addresses.add(address2);


        // addresses.add(new Address("1","2123sdw121cas","123 ","main st","city1","maha","india","413520"));
         System.out.println(addresses);
         customerDto.setCurrentAddress( addresses);
         List<Address> retrivedAddresses= customerDto.getCurrentAddress();
          Assertions.assertEquals(addresses,retrivedAddresses);

     }


}
