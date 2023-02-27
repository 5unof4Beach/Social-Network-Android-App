package com.materialuiux.socialmediaapp.model;

public class Stories {

    String imageUrl;
    String name;

    public Stories(String name, String imageUrl) {
        this.imageUrl = imageUrl;
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }
}
