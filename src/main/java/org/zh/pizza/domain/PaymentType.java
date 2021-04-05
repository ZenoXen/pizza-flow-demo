package org.zh.pizza.domain;

import java.util.Arrays;
import java.util.List;

public enum PaymentType {
    CASH,CHECK,CREDIT_CARD;

    public static List<PaymentType> asList(){
        return Arrays.asList(PaymentType.values());
    }
}
