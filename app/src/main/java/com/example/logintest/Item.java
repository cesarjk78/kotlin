package com.example.logintest;

public class Item {
    private final int imageResId;
    private final String description;

    public Item(int imageResId, String description) {
        this.imageResId = imageResId;
        this.description = description;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getDescription() {
        return description;
    }
}
