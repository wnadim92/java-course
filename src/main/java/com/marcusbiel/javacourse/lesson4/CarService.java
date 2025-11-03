package com.marcusbiel.javacourse.lesson4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

    private final Logger log = LoggerFactory.getLogger(CarService.class);

    public static void drive() {
        Car[] cars = {new BMW(), new Porsche(), new Mercedes(),};
        for (Car car: cars) {
            car.drive();
        }
    }

    public void process(String input) {
        CarState carState = CarState.from(input);
        processinglog(input);
    }

    public void processinglog(String input) {
        log.info("processing car {}", input);
    }

    public void errorlog(RuntimeException e) {
        log.error("runtime error {}", e);
    }
}
