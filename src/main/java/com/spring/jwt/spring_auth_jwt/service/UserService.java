package com.spring.jwt.spring_auth_jwt.service;

import com.spring.jwt.spring_auth_jwt.dto.UserDto;
import com.spring.jwt.spring_auth_jwt.entity.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findByUsername(String username);

    User save(UserDto userDto);
}
