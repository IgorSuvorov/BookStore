package com.example.bookstore.repository;

import com.example.bookstore.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Igor Suvorov
 */
public interface ItemRepository extends JpaRepository<Item, Long> {
}
