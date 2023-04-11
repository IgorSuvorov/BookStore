package com.example.bookstore.service;

import com.example.bookstore.model.Item;

import java.util.List;

/**
 * @author Igor Suvorov
 */
public interface ItemService {
    List<Item> findAll();
    Item findById(Long id);
    Item save(Item item);
}
