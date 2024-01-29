package com.example.firstSpringProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class FirstSpringProjectApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(FirstSpringProjectApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringProjectApplication.class, args);
        System.out.println("Hello How are you");
        LOGGER.trace("this is  trace");
        LOGGER.info("this is first info");

    }

}
