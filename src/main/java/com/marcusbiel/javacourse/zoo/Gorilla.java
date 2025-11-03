package com.marcusbiel.javacourse.zoo;

public class Gorilla extends Animal {

    @Override
    public void eat() {
        System.out.println("Gorilla is eating...");
    }

    public void age() {
        System.out.println("Gorilla is implementing the age by itself");
    }
}
