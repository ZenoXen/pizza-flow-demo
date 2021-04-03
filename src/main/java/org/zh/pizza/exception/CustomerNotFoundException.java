package org.zh.pizza.exception;

public class CustomerNotFoundException extends Exception{
    public CustomerNotFoundException(){
        super("找不到指定的顾客");
    }
}
