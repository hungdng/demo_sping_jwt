package com.hungta.jwt.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hungta.jwt.security.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
