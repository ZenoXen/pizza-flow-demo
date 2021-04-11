package org.zh.pizza.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class Order implements Serializable {
    private Integer id;
    private Customer customer;
    private List<Pizza> pizzas;
    private PaymentDetails payment;
    public Order(){
        this.pizzas = new ArrayList<>();
    }

    public Pizza addPizza(Pizza pizza){
        pizzas.add(pizza);
        return pizza;
    }

}
