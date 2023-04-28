package org.models;

import java.util.UUID;

public class Category {
    private String id;
    private String name;
    private User user;

    public Category(String name, User user) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.user = user;
    }

    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
