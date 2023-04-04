package com.example.bookstore.controller;
import com.example.bookstore.model.BlogPost;
import com.example.bookstore.model.Item;
import com.example.bookstore.model.Order;
import com.example.bookstore.repository.BlogPostRepository;
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
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogPostRepository blogPostRepository;

    @GetMapping
    public String getBlogPage(Model model) {
        List<BlogPost> blogPosts = blogPostRepository.findAll();
        model.addAttribute("blogPosts", blogPosts);
        return "blog/blog";
    }
}
