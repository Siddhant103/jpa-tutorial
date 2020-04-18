package com.jpaTutorial.jpatutorial;

import com.jpaTutorial.jpatutorial.Entity.User;
import com.jpaTutorial.jpatutorial.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDAOCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserDAOCommandLineRunner.class);

    @Autowired
    UserDAOService userDAOService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
        long id = userDAOService.insert(user);
        log.info("New User is created : " + user + " with id = " + id);
    }
}
