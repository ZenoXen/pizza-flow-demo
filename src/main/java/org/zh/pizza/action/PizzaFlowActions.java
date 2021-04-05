package org.zh.pizza.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.zh.pizza.domain.*;
import org.zh.pizza.exception.CustomerNotFoundException;
import org.zh.pizza.repository.CustomerRepository;
import org.zh.pizza.repository.OrderRepository;

import java.util.*;

@Component
public class PizzaFlowActions {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private OrderRepository orderRepository;

    private Set<String> availableZipCodes;
    private Map<Pizza.PizzaSizeEnum,Double> pizzaPrice;

    public PizzaFlowActions(){
        availableZipCodes = new HashSet<>(Arrays.asList("310000","325600","325000"));
        pizzaPrice = new HashMap<>();
        pizzaPrice.put(Pizza.PizzaSizeEnum.SMALL,10.0);
        pizzaPrice.put(Pizza.PizzaSizeEnum.MEDIUM,13.0);
        pizzaPrice.put(Pizza.PizzaSizeEnum.LARGE,16.0);
        pizzaPrice.put(Pizza.PizzaSizeEnum.GINORMOUS,20.0);
    }



    public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
        return customerRepository.findByPhoneNumber(phoneNumber)
                .orElseThrow(() -> new CustomerNotFoundException(phoneNumber));
    }

    public boolean checkDeliveryArea(String zipCode){
        return availableZipCodes.contains(zipCode);
    }

    public Customer addCustomer(Customer customer){
        return customerRepository.addCustomer(customer);
    }

    public PaymentDetails generatePayment(Order order){
        PaymentDetails paymentDetails=new PaymentDetails();
        double amount=0;
        for (Pizza pizza : order.getPizzas()) {
            amount+=pizzaPrice.get(pizza.getSize());
        }
        paymentDetails.setAmount(amount);
        return paymentDetails;
    }

    public PaymentDetails verifyPayment(PaymentDetails paymentDetails){
        return paymentDetails;
    }

    public Order saveOrder(Order order){
        return orderRepository.save(order);
    }
}
