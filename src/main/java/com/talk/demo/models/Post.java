package com.talk.demo.models;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.talk.demo.JsonUtils;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Post implements Serializable {

    @JsonProperty("From")
    private String from;

    @JsonProperty(value = "To")
    private List<User> to;

    @JsonProperty(value = "Body")
    private String body;

    @JsonProperty(value = "Type")
    private String type;

    @JsonProperty(value = "Msg_Type")
    private int msgType;

    @JsonProperty(value = "Host")
    private String host;

    @JsonProperty(value = "Domain")
    private String domain;

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Post() {}

    public Post(String from, List<User> to, String body, String type, int msgType, String host, String domain) {
        this.from = from;
        this.to = to;
        this.body = body;
        this.type = type;
        this.msgType = msgType;
        this.host = host;
        this.domain = domain;
    }

    public String getFrom() {
        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public List<User> getTo() {
        return this.to;
    }

    public void setTo(List<User> to) {
        this.to = to;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }

    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

//    @Override
//    public String toString() {
//        return JsonUtils.jsonString(this);
////        return "Post{" +
////                "From=" + From +
////                ", To=" + To +
////                ", Body='" + Body + '\'' +
////                '}';
//    }
}
