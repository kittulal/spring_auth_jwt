package com.spring.jwt.spring_auth_jwt.repositories;

import com.spring.jwt.spring_auth_jwt.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}