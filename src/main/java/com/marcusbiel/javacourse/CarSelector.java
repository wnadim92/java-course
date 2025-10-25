package com.marcusbiel.javacourse;

public class CarSelector {

    public static void main(String[] arguments) {
        CarService carService = new CarService();
        for (String argument : arguments) {
            try {
                carService.process(argument);
            } catch(RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
