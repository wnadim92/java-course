package com.marcusbiel.javacourse;

public class BMW implements Car {

    public void drive() {
        System.out.println("Driving BMW...");
    }

    public int value() {
        return 8000;
    }

    public String owner() {
        return "Marcus";
    }
}
