package com.marcusbiel.javacourse.lesson2;

import com.marcusbiel.javacourse.lesson2.Person;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {
        Person marcus = new Person();

        assertEquals("Hello World", marcus.helloWorld());
    }

    @Test
    public void shouldReturnHelloMarcus() {
        Person person1 = new Person();

        assertEquals("Hello Marcus", person1.hello("Marcus"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();

        assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void demonstrateBoolean() {
        int i = 4;
        int j = 3;
        boolean areEqual = i != j;

        if (i > j) {
            i = 99;
        } else if (j > i) {
            i++;
        } else if (!areEqual) {
            i = 8;
        } else {
            j++;
        }
    }

    @Test
    public void shouldReturnNumberOfPersonsInLoop() {

        Person person1;

        for (int i = 0; i < 4; i++) {
            person1 = new Person();
        }

        assertEquals(4, Person.numberOfPersons());

    }
}