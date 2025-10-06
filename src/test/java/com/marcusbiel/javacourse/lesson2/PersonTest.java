package test.java.com.marcusbiel.javacourse.lesson2;

import main.java.com.marcusbiel.javacourse.lesson2.Person;
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
        Person person1;
        for (int i = 0; i < 4; i++) {
            person1 = new Person();
        }
        assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void demonstrateArrays() {
        Person[] persons = new Person[4];
//        persons[0] = new Person();
//        persons[1] = new Person();
//        persons[2] = new Person();
//        persons[3] = new Person();

        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
        }

        for (Person person : persons) {
            person.helloPerson("Sam");
        }

        assertEquals(4, Person.numberOfPersons());


    }




}