package com.example.androiddz6.Model;

public class ModelHomeFragment {
    private int imageView;
    private String title;
    private String time;

    public ModelHomeFragment(int imageView, String title, String time) {
        this.imageView = imageView;
        this.title = title;
        this.time = time;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
