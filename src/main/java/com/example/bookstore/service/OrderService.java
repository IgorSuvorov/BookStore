package com.example.bookstore.service;

import com.example.bookstore.model.Order;
import com.example.bookstore.model.User;

import java.util.List;

/**
 * @author Igor Suvorov
 */
public interface OrderService {
    Order findById(Long id);
    List<Order> findByUser(User user);
    Order save(Order order);
}
