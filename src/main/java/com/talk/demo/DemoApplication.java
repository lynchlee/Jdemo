package com.talk.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@SpringBootApplication
public class DemoApplication {

    private static Logger logger = LogManager.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        logger.info("this is start spring boot");
        SpringApplication.run(DemoApplication.class, args);
    }

}
