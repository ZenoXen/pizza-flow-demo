package org.zh.pizza.exception;

public class CustomerNotFoundException extends Exception{
    public CustomerNotFoundException(String phoneNumber){
        super(String.format("Cannot find Customer with number %s",phoneNumber));
    }
}
