package com.example.bookstore.service;

import com.example.bookstore.model.Role;

/**
 * @author Igor Suvorov
 */
public interface RoleService {
    Role findByName(String name);
    Role save(Role role);
}
