package com.example.bookstore.service;

import com.example.bookstore.model.User;

import java.util.Optional;

/**
 * @author Igor Suvorov
 */
public interface UserService {
    Optional<User> findByUsername(String username);
    User findByEmail(String email);

    User save(User user);

    void updateUser(User updatedUser);
}
