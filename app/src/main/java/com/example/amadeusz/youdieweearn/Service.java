package com.example.amadeusz.youdieweearn;

public class Service extends OfferElement {

    String dateOfImplementation;

    public Service(String name, double price, String description, int image) {
        super(name, price, description, image);
        dateOfImplementation = "";
    }

}
