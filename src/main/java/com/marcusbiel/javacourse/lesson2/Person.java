package main.java.com.marcusbiel.javacourse.lesson2;

import main.java.com.marcusbiel.javacourse.lesson3.Name;

public class Person {

    private Name personName;
    private static int personCounter;

    public Person(Name personName) {
        this.personName = personName;
    }

    public Person() {
        personCounter++;
        /*
        empty on purpose - default constructor
         */

        // Single line comment
    }

    public String helloWorld() {
        return "Hello World";
    }

    public String hello(String name) {
        return "Hello  " + name;
    }

    public static int numberOfPersons() {
        return personCounter;
    }
}
