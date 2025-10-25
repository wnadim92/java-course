package com.marcusbiel.javacourse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

    private final Logger log = LoggerFactory.getLogger(CarService.class);

    public void process(String input) {
        CarState carState = CarState.from(input);
        log.info("processing car {}", input);
    }

}
