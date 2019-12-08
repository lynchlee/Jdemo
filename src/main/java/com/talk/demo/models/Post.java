package com.talk.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Post implements Serializable {

    private String From;
    private List<User> To;
    private String Body;
    private String Type;
    private int Msg_Type;
    private String Host;
    private String Domain;

    public String getDomain() {
        return this.Domain;
    }

    public void setDomain(String domain) {
        this.Domain = domain;
    }

    public Post() {}

    public Post(String From, List<User> To, String Body, String Type, int Msg_Type, String Host, String Domain) {
        this.From = From;
        this.To = To;
        this.Body = Body;
        this.Type = Type;
        this.Msg_Type = Msg_Type;
        this.Host = Host;
        this.Domain = Domain;
    }

    public String getFrom() {
        return this.From;
    }

    public void setFrom(String From) {
        this.From = From;
    }

    public List<User> getTo() {
        return this.To;
    }

    public void setTo(List<User> to) {
        this.To = to;
    }

    public String getType() {
        return this.Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public int getMsg_Type() {
        return this.Msg_Type;
    }

    public void setMsg_Type(int msg_Type) {
        this.Msg_Type = msg_Type;
    }

    public String getHost() {
        return this.Host;
    }

    public void setHost(String host) {
        this.Host = host;
    }

    public String getBody() {
        return this.Body;
    }

    public void setBody(String body) {
        this.Body = body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "From=" + From +
                ", To=" + To +
                ", Body='" + Body + '\'' +
                '}';
    }
}
