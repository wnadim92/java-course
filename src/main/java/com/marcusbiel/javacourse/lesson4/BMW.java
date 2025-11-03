package com.marcusbiel.javacourse.lesson4;

public class BMW implements Car, Loggable, Asset, Property {

    public void drive() {
        System.out.println("Driving BMW...");
    }

    public int value() {
        return 8000;
    }

    public String owner() {
        return "Marcus";
    }

    @Override
    public String message() {
        return "I am the car";
    }
}
