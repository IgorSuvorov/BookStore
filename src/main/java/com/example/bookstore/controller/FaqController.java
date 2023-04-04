package com.example.bookstore.controller;
import com.example.bookstore.model.FaqEntry;
import com.example.bookstore.model.Item;
import com.example.bookstore.model.Order;
import com.example.bookstore.repository.FaqRepository;
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
@RequestMapping("/faq")
public class FaqController {

    @Autowired
    private FaqRepository faqRepository;

    @GetMapping
    public String getFaqPage(Model model) {
        List<FaqEntry> faqEntries = faqRepository.findAll();
        model.addAttribute("faqEntries", faqEntries);
        return "faq/faq";
    }
}
