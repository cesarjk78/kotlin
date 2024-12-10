package com.example.logintest;

public class itemsh {
    private final int imageResId;
    private final String description;

    public itemsh(int imageResId, String description) {
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
