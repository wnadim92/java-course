package com.marcusbiel.javacourse;

import org.junit.Test;

public class CarSelectorTest {

    @Test
    public void shouldCallMain() {
        String[] arguments = {"DRIVING", "WAITING", "PARKING", "flying", "jumping"};
        CarSelector.main(arguments);
    }
}
