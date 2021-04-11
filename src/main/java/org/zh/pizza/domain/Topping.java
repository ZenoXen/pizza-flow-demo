package org.zh.pizza.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public enum Topping implements Serializable {
    CARROT,CHEESE,SAUCE;

    public static List<Topping> asList(){
        return Arrays.asList(Topping.values());
    }
}
