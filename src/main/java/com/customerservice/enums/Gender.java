package com.customerservice.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Gender {

    MALE("male"),
    FEMALE("female"),
    OTHER("other");
  private final String gender;

}
