package com.example.bookstore.repository;

import com.example.bookstore.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Igor Suvorov
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
