package com.spring.jwt.spring_auth_jwt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.jwt.spring_auth_jwt.entity.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
