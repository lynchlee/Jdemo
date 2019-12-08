package com.talk.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class User implements Serializable {
    @JsonProperty("User")
    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    private String User;

    public User(String user) {
        this.User = user;
    }

    @Override
    public String toString() {
        return "User{" +
                "User=" + User +
                '}';
    }

}