package org.zh.pizza.domain;

import lombok.Data;

@Data
public class Customer {
    private String phoneNumber;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipCode;
}
