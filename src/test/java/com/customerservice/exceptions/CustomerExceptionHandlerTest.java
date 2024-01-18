package com.customerservice.exceptions;

import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;

public class CustomerExceptionHandlerTest {
    @InjectMocks
    private CustomerExceptionHandler exceptionHandler;
    @Mock
    private CustomerNotFoundException notFoundException;
    @Mock
    private ConstraintViolationException constraintViolationException;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);

    }
    @Test
            public void testHandlerCustomerNotFoundException(){
        Assertions.assertEquals(exceptionHandler.handleCustomerNotFoundException(notFoundException).getStatusCode(), HttpStatus.NOT_FOUND);

    }

}
