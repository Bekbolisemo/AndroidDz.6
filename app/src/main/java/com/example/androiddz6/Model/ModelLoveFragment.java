package com.example.androiddz6.Model;

public class ModelLoveFragment {
    private int MainImage;
    private int SecondImage;
    private String title;

    public ModelLoveFragment(int mainImage, int secondImage, String title) {
        MainImage = mainImage;
        SecondImage = secondImage;
        this.title = title;
    }

    public int getMainImage() {
        return MainImage;
    }

    public void setMainImage(int mainImage) {
        MainImage = mainImage;
    }

    public int getSecondImage() {
        return SecondImage;
    }

    public void setSecondImage(int secondImage) {
        SecondImage = secondImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
