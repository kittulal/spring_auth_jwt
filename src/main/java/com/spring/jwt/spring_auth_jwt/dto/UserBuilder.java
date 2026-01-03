package com.spring.jwt.spring_auth_jwt.dto;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UserBuilder {

    private String username;
    private String password;
    private String email;
    private String role;
    private boolean active;
    private Set<String> roles;

    public UserBuilder username(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder password(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder role(String role) {
        this.role = role;
        return this;
    }

    public UserBuilder active(boolean active) {
        this.active = active;
        return this;
    }
    public UserBuilder roles(String[] roles) {
        this.roles = new HashSet<>(Arrays.asList(roles));
        return this;
    }

    public UserDto build() {
        // validation
        if (username == null || password == null) {
            throw new IllegalStateException("username and password are mandatory");
        }

        return new UserDto(username, password, email, role, active, roles);
    }
}
