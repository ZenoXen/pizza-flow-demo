package org.zh.pizza.domain;

import java.util.Arrays;
import java.util.List;

public enum Topping {
    CARROT,CHEESE,SAUCE;

    private static List<Topping> asList(){
        return Arrays.asList(Topping.values());
    }
}
