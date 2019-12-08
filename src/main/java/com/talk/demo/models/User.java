package com.talk.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class User implements Serializable {
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        user = user;
    }

    @JsonProperty("User")
    private String user;

    public User(String user) {
        this.user = user;
    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "User=" + User +
//                '}';
//    }

}