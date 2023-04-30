package org.models;

import java.util.UUID;

public class ImageM {
    private String id;
    private String name;
    private String route;
    private Category category;

    public ImageM(String route, String name, Category category) {
        this.id = UUID.randomUUID().toString();
        this.route = route;
        this.name = name;
        this.category = category;
    }
    
    public String getId() {
        return id;
    }

    public String getRoute() {
        return route;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
