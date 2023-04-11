package com.example.bookstore.controller;
import com.example.bookstore.model.Item;
import com.example.bookstore.model.Order;
import com.example.bookstore.model.User;
import com.example.bookstore.repository.ItemRepository;
import com.example.bookstore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;
/**
 * @author Igor Suvorov
 */
@Controller
@RequestMapping("/my-orders")
public class MyOrdersController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public String getOrders(User user, Model model) {
        List<Order> orders = orderService.findByUser(user);
        model.addAttribute("orders", orders);
        return "orders/my-orders";
    }
}
