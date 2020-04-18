package com.jpaTutorial.jpatutorial;

import com.jpaTutorial.jpatutorial.Entity.User;
import com.jpaTutorial.jpatutorial.service.UserDAOService;
import com.jpaTutorial.jpatutorial.service.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jill", "Admin");
        userRepository.save(user);

        Optional<User> userWithIdOne = userRepository.findById(1L);
        log.info("New User is retrieved : " + userWithIdOne);

        List<User> users = userRepository.findAll();
        log.info("All users = " + users);

        
    }
}
