package com.marcusbiel.javacourse.zoo;

public abstract class Animal {

    public abstract void eat();

    protected void age() {
        System.out.println("age is calculated...");
    }
}
