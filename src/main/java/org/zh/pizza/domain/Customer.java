package org.zh.pizza.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Customer implements Serializable {
    private String phoneNumber;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipCode;
}
