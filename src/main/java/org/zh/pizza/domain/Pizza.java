package org.zh.pizza.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Pizza implements Serializable {
    private PizzaSizeEnum size;
    private List<Topping> toppings;
    public enum PizzaSizeEnum{
        SMALL,MEDIUM,LARGE,GINORMOUS
    }
}
