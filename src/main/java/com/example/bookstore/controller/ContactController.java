package com.example.bookstore.controller;

import com.example.bookstore.model.ContactFormEntry;
import com.example.bookstore.repository.ContactFormEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Igor Suvorov
 */
@Controller
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactFormEntryRepository contactFormEntryRepository;

    @GetMapping
    public String getContactPage(Model model) {
        model.addAttribute("contactFormEntry", new ContactFormEntry());
        return "contact/contact";
    }

    @PostMapping
    public String submitContactForm(@ModelAttribute("contactFormEntry") ContactFormEntry contactFormEntry) {
        contactFormEntryRepository.save(contactFormEntry);
        return "redirect:/contact?success";
    }
}
