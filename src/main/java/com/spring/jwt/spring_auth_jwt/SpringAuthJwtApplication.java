package com.spring.jwt.spring_auth_jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringAuthJwtApplication implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        String encodedPassword = passwordEncoder.encode("mypassword");
        System.out.println(encodedPassword);
    }

    @Autowired
    private PasswordEncoder passwordEncoder;


	public static void main(String[] args) {
		SpringApplication.run(SpringAuthJwtApplication.class, args);
	}

}
