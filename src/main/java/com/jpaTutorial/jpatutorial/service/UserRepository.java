package com.jpaTutorial.jpatutorial.service;

import com.jpaTutorial.jpatutorial.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
