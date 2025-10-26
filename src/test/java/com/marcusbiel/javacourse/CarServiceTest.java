package com.marcusbiel.javacourse;

import org.junit.Test;

public class CarServiceTest {

    @Test
    public void shouldDemonstrateLogging() {
        CarService carService = new CarService();
        carService.process("BMW");
    }

    @Test
    public void shouldDemonstrateInterfaces() {
        CarService carService = new CarService();
        CarService.drive();

    }

}
