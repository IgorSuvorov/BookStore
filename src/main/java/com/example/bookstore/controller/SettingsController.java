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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

/**
 * @author Igor Suvorov
 */
@Controller
@RequestMapping("/settings")
public class SettingsController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getSettings(User user, Model model) {
        Optional<User> rsl = userService.findByUsername(user.getUsername());
        model.addAttribute("user", user);
        return "settings/settings";
    }

    @PostMapping
    public String updateSettings(@ModelAttribute("user") User updatedUser) {
        userService.updateUser(updatedUser);
        return "redirect:/settings?success";
    }
}
