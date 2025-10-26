package com.conradoproject.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.conradoproject.course.entities.User;
import com.conradoproject.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User("Maria Brown", "maria@gmail.com", "48991435810", "12345", null);
        User u2 = new User("Alex Green", "alex@gmail.com", "48984067045", "54321", null);

        userRepository.saveAll(Arrays.asList(u1, u2));

    
    }


}
