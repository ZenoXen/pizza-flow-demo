package org.zh.pizza.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class Order implements Serializable {
    private Customer customer;
    private List<Pizza> pizzas;
    private Payment payment;
    public Order(){
        this.pizzas = new ArrayList<>();
    }

}
