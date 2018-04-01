package com.example.will.hw02;

import android.graphics.Bitmap;

/**
 * Created by Will on 4/1/18.
 */

public class App {
    private String name;
    private Bitmap thumbnail;
    private double price;
    private boolean favorite;

    public App() {
        this.name = "";
        this.thumbnail = null;
        this.price = 0.00;
        this.favorite = false;
    }

    public App(String name, Bitmap thumbnail, double price, boolean favorite) {
        this.name = name;
        this.thumbnail = thumbnail;
        this.price = price;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bitmap getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Bitmap thumbnail) {
        this.thumbnail = thumbnail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", thumbnail=" + thumbnail +
                ", price=" + price +
                ", favorite=" + favorite +
                '}';
    }
}
