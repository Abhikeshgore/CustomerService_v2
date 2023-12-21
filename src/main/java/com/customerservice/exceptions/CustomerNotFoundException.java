package com.customerservice.exceptions;

import com.customerservice.enums.ErrorConstant;
import lombok.Getter;
import org.springframework.web.bind.annotation.ControllerAdvice;

@Getter
public class CustomerNotFoundException extends RuntimeException{
    private static  final long serialVersionUID= 1L;
    private String exceptionCode;
    private String exceptionMessage;

    public CustomerNotFoundException(ErrorConstant constant)
    {
        this.exceptionCode =constant.getErrorcode();
        this.exceptionMessage= constant.getErrormessage();
    }





    }

