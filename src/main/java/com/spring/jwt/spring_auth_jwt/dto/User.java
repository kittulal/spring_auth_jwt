package com.spring.jwt.spring_auth_jwt.dto;


import lombok.Data;
import lombok.Getter;

@Getter
public class User {
    private String username;
    private String password;
    private String email;
    private String role;
    private boolean active;

    public User() {
    }

    public User(String username, String password, String email, String role, boolean active) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.active = active;
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
}

