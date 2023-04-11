package com.example.bookstore.service;

import com.example.bookstore.model.Item;
import com.example.bookstore.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Igor Suvorov
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public Item findById(Long id) {
        return itemRepository.findById(id).orElse(null);
    }

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }
}
