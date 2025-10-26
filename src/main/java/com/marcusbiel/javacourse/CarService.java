package com.marcusbiel.javacourse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

    private final Logger log = LoggerFactory.getLogger(CarService.class);

    public static void drive() {
        BMW bmw = new BMW();
        Porsche porsche = new Porsche();
        Mercedes mercedes = new Mercedes();

        bmw.drive();
        porsche.drive();
        mercedes.drive();
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
