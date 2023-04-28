package org.models;

import java.util.UUID;

public class Image {
    private String id;
    private String route;
    private Category category;

    public Image(String route, Category category) {
        this.id = UUID.randomUUID().toString();
        this.route = route;
        this.category = category;
    }
    
    public String getId() {
        return id;
    }

    public String getRoute() {
        return route;
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
