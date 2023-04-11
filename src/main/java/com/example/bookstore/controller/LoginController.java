package com.example.bookstore.controller;
import com.example.bookstore.model.Item;
import com.example.bookstore.model.Order;
import com.example.bookstore.model.User;
import com.example.bookstore.repository.ItemRepository;
import com.example.bookstore.service.OrderService;
import com.example.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
/**
 * @author Igor Suvorov
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public String getLoginPage(@RequestParam(value = "error", required = false) String error, Model model) {
        if (error != null) {
            model.addAttribute("errorMessage", "Invalid username or password.");
        }
        return "auth/login";
    }


}
