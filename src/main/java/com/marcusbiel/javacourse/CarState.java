package com.marcusbiel.javacourse;

import java.io.IOException;

public enum CarState {
    DRIVING, WAITING, PARKING;

    public static CarState from(String state) {
        switch(state) {
            case "DRIVING":
                return DRIVING;
            case "WAITING":
                return WAITING;
            case "PARKING":
                return PARKING;
            default:
                throw new RuntimeException("unknown state:" + state);
        }
    }
}
