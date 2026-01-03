package com.spring.jwt.spring_auth_jwt.service;

import com.spring.jwt.spring_auth_jwt.dto.UserDto;
import com.spring.jwt.spring_auth_jwt.entity.User;
import com.spring.jwt.spring_auth_jwt.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

public class UserServiceImpl implements UserService{

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User save(UserDto userDto) {
        User user = new User(userDto.getUsername(), passwordEncoder.encode(userDto.getPassword()));
        return userRepository.save(user);
    }
}
