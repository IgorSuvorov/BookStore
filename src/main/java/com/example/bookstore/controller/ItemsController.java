package com.example.bookstore.controller;

import com.example.bookstore.model.Item;
import com.example.bookstore.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Igor Suvorov
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    public String getItems(Model model) {
        List<Item> items = itemRepository.findAll();
        model.addAttribute("items", items);
        return "items/item-list";
    }
}
