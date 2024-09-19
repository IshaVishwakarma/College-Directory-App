package com.example.college_management.College_Directory_Application.repository;

import com.example.college_management.College_Directory_Application.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
