package com.customerservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorConstant {
        CUSTOMER_NOT_FOUND("CUSTOMER_NOT_FOUND","Customer with given id does not exist"),
        CUSTOMERS_NOT_FOUND("CUSTOMERS_NOT_FOUND","Customers do not exist"),
        SERVER_ERROR("INTERNET_SERVER_ERROR","Something went wrong"),
        BAD_REQUEST("BAD_REQUEST","Please enter all required fields");

        private final String errorcode;
        private final String errormessage;


}
