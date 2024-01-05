package com.customerservice.exceptions;

import com.customerservice.enums.ErrorConstant;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import  com.customerservice.dtos.ErrorResponse;

import java.time.LocalDateTime;

@ControllerAdvice
public class CustomerExceptionHandler {

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleCustomerNotFoundException(CustomerNotFoundException notFoundException){
        ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(), notFoundException.getExceptionCode(), notFoundException.getExceptionMessage() );
        return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ErrorResponse> handleValidationException(ConstraintViolationException validateException){
        ErrorResponse errorResponse=new ErrorResponse(LocalDateTime.now(), ErrorConstant.BAD_REQUEST.getErrorcode(),
                validateException.getConstraintViolations().stream().findFirst().get().getMessage());
        return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.BAD_REQUEST);
    }
}
