package com.apogee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apogee.EntityModel.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User>findByEmail(String email); 
    User findByEmailAndPassword(String email, String password);
}
