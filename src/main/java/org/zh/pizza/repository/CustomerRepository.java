package org.zh.pizza.repository;

import org.springframework.stereotype.Repository;
import org.zh.pizza.domain.Customer;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class CustomerRepository{

    private Map<String, Customer> customers=new HashMap<>();

    public Optional<Customer> findByPhoneNumber(String phoneNumber){
        return Optional.ofNullable(customers.get(phoneNumber));
    }

    public Customer addCustomer(Customer customer){
        customers.put(customer.getPhoneNumber(),customer);
        return customer;
    }
}
