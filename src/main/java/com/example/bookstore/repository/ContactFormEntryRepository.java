package com.example.bookstore.repository;

import com.example.bookstore.model.ContactFormEntry;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Igor Suvorov
 */
public interface ContactFormEntryRepository extends JpaRepository<ContactFormEntry, Long> {
}
