package org.zh.pizza.repository;

import org.springframework.stereotype.Repository;
import org.zh.pizza.domain.Order;

import java.util.HashMap;
import java.util.Map;

@Repository
public class OrderRepository {

    private static int id = 0;
    private Map<Integer,Order> orders=new HashMap<>();

    public Order save(Order order){
        order.setId(++id);
        orders.put(order.getId(),order);
        return order;
    }
}
