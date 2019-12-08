package com.talk.demo.controller;

import com.talk.demo.DemoApplication;
import com.talk.demo.models.Post;
import com.talk.demo.service.RestService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    private static Logger logger = LogManager.getLogger(HelloController.class);

    @Autowired
    private RestService restService;

//    HelloController(RestService restService) {
//        this.restService = restService;
//    }
//
    @GetMapping("/")
    public String getTaxiFare() {
        return "hello, world";
    }

    @RequestMapping(value = "/sendMessage", method = RequestMethod.POST)
    public boolean sendMessage(
            @RequestBody Post request) {
        logger.info("this is request msg {}", request.toString());
        restService.createPostWithObject();
        return true;
    }
}