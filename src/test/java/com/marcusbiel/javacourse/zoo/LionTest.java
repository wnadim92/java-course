package com.marcusbiel.javacourse.zoo;

import org.junit.Test;
import static org.junit.Assert.*;

public class LionTest {

    @Test
    public void shouldCloneStringArray() {
        String[] array = {"one","two","three",};
        String[] copiedArray = array.clone();
        try {
            assertSame(array, array);
            assertNotSame(array, copiedArray);
        } catch(RuntimeException e) {
            System.out.println(e);
        } finally {
            System.out.println("Completed comparing");
        }
    }


}
