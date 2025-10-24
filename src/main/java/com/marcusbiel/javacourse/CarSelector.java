package com.marcusbiel.javacourse;

public class CarSelector {

    public static void main(String[] args) {
        for (String arg : args) {
            new CarService().process("BMW");
        }
    }

}
