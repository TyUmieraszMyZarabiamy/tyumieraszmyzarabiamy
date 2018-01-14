package com.example.amadeusz.youdieweearn;

public class Product extends OfferElement {

    private String color;
    private int quantity;

    public Product(String name, double price, String description, int image, String color, int quantity) {
        super(name, price, description, image);
        this.color = color;
        this.quantity = quantity;
    }

}
