package com.marcusbiel.javacourse;

public class CarSelector {

    public static void main(String[] arguments) {
        CarService carService = new CarService();
        for (String argument : arguments) {
            if (isValid(argument)) {
                carService.process(argument);
            } else {
                System.err.println("ignoring invalid argument" + argument);
            }
        }
    }

    public static boolean isValid(String argument) {
        try {
            CarState carState = CarState.valueOf(argument);
        } catch(IllegalArgumentException e) {
            return false;
        }
        return true;
    }

}
