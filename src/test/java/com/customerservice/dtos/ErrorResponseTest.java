package com.customerservice.dtos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class ErrorResponseTest {
    ErrorResponse errorResponse;
    LocalDateTime timestamp;


    @BeforeEach
    public void setUp()
    {
        timestamp =LocalDateTime.of(2024,1,16,11,28);
        errorResponse = new ErrorResponse(timestamp,"ERROR_CODE","ERROR_MESSAGE");
    }

    @Test
    public void testGetTimestamp(){
        Assertions.assertEquals(timestamp,errorResponse.getTimestamp());
    }
    @Test
    public void testGetErrorCode()
    {
        Assertions.assertEquals("ERROR_CODE",errorResponse.getErrorCode());

    }
    @Test
    public void testGetErrorMessage()
    {
        Assertions.assertEquals("ERROR_MESSAGE",errorResponse.getErrorMessage());
    }
}
