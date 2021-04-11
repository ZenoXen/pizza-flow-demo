package org.zh.pizza.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public enum PaymentType implements Serializable {
    CASH,CHECK,CREDIT_CARD;

    public static List<PaymentType> asList(){
        return Arrays.asList(PaymentType.values());
    }
}
