package com.marcusbiel.javacourse.zoo;

public class Lion extends Animal implements Loggable, Printable {

    @Override
    public void eat() {
        System.out.println("Lion is eating...");
    }

    @Override
    public void print() {
        System.out.println("printing...");
    }

    @Override
    public String message() {
        return "something";
    }

}
