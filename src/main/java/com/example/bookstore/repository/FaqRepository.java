package com.example.bookstore.repository;

import com.example.bookstore.model.FaqEntry;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Igor Suvorov
 */
public interface FaqRepository extends JpaRepository<FaqEntry, Long> {
}
