package org.zh.pizza.domain;

import lombok.Data;

@Data
public class PaymentDetails {
    private PaymentType paymentType;
    private Double amount;
}
