package com.talk.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@RestController
@SpringBootApplication
public class DemoApplication {

    private static Logger logger = LogManager.getLogger(DemoApplication.class);

    @RequestMapping("/")
    String home() {
        logger.info("this is hello world");
        return "Hello, world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
