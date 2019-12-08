package com.talk.demo.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.talk.demo.JsonUtils;
import com.talk.demo.models.Post;
import com.talk.demo.models.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;

import java.time.Duration;
import java.util.*;

@Service
public class RestService {
    private final RestTemplate restTemplate;
    private static Logger logger = LogManager.getLogger(RestService.class);

    public RestService(RestTemplateBuilder restTemplateBuilder) {
        // set connection and read timeouts
        this.restTemplate = restTemplateBuilder
                .setConnectTimeout(Duration.ofSeconds(500))
                .setReadTimeout(Duration.ofSeconds(500))
                .build();
    }

    public Post createPostWithObject() {
        logger.info("this is createPostWithObject");
        String url = "http://localhost:10050/qtalk/send_message";
        logger.info("this is tolist", url);
        // create headers
        HttpHeaders headers = new HttpHeaders();
        // set `content-type` header
        headers.setContentType(MediaType.APPLICATION_JSON);
        // set `accept` header
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        List<User> toList = new ArrayList<User>();
        User user1 = new User("chao1.zhang");
        toList.add(user1);
        User user2 = new User("chao2.zhang");
        toList.add(user2);


        // create a post object
        Post post = new Post("chao.zhang", toList, "hello", "chat", 1, "qtalk", "qtalk");

        logger.info("this is xxxxxxxx {}", JsonUtils.jsonString(post));
        // build the request
        HttpEntity<Post> entity = new HttpEntity<>(post, headers);

//        logger.info("this is tolist [{}]", entity);

        // send POST request
        JSONObject ret = restTemplate.postForObject(url, post, JSONObject.class);

        if (!Objects.isNull(ret)) {
            logger.info("this is " + ret.getString("From"));

            return JsonUtils.parse(ret.toJSONString(), Post.class);
        }

        return null;
    }
}
