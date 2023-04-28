package org.models;

import java.util.UUID;

public class User {
    private String id;
    private String username;

    public User(String username) {
        this.id = UUID.randomUUID().toString();
        this.username = username;
    }
    
    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
