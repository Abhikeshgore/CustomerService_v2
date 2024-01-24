//package com.customerservice.converters;
//
//import com.customerservice.dtos.CustomerDto;
//import com.customerservice.entities.Customer;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.MockitoAnnotations;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CustomerConverterTest {
//    @InjectMocks
//    private CustomerConverter customerConverter;
//    private Customer customer;
//    private CustomerDto customerDto;
//
//    @BeforeEach
//    public void setUp()
//    {
//        MockitoAnnotations.initMocks(this);
//        customer =new Customer();
//        customer.setFirstName("Anirudha");
//        customer.setLastName("Adekar");
//        customerDto =new CustomerDto();
//        customerDto.setFirstName("Abhay");
//        customerDto.setLastName("Gore");
//
//    }
//
//    @Test
//    public void testEntityToDto(){
//        Assertions.assertEquals(customerConverter.entityToDto(customer).getFirstName(),"Anirudha");
//    }
//
//    @Test
//    public void testEntitytoDtoForList(){
//        List<Customer> customers=new ArrayList<>();
//        customers.add(customer);
//        Assertions.assertEquals(customerConverter.entityToDto(customers).size(),1);
//
//    }
//    @Test
//    public void testDtoToEntity(){
//        Assertions.assertEquals(customerConverter.dtoToEntity(customerDto).getFirstName(),"Abhay");
//    }
//
//    @Test
//    public void testDtoToEntityForList(){
//        List<CustomerDto> customerDtos=new ArrayList<>();
//        customerDtos.add(customerDto);
//        Assertions.assertEquals(customerConverter.dtoToEntity(customerDtos).size(),1);
//
//    }
//}
