package com.spring.jwt.spring_auth_jwt.dto;


import lombok.Getter;

import java.util.Set;

@Getter
public class UserDto {
    private String username;
    private String password;
    private String email;
    private String role;
    private boolean active;
    Set<String> roles;

    public UserDto() {
    }

    public UserDto(String username, String password, String email, String role, boolean active, Set<String> roles) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.active = active;
        this.roles = roles;
    }
    // ✅ Static method to get builder
    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public boolean isActive() {
        return active;
    }

    public Set<String> getRoles() {
        return roles;
    }
}

