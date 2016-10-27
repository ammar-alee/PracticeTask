package com.example.ammarali.practicerecyclerview.model;

/**
 * Created by Ammar.Ali on 10/26/16.
 */

public class ListItem {
    private String title;
    private int imageResId;
    private String url;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }
}