package com.example.amadeusz.youdieweearn;

public abstract class OfferElement {

    private String name;
    private double price;
    private String description;
    private int image;

    public OfferElement(String name, double price, String description, int image) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
    }

    public int getImageId() {
        return image;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

}
