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
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();

        assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void shouldReturnNumberOfPersonsInLoop() {
        Person person1;

        int i = 0;
        do {
            person1 = new Person();
            i++;
        } while (i < 4);
        assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void demonstrateArrays() {
        Person[] persons = new Person[4];
        Person myPerson = new Person();
        persons[0] = new Person();
        persons[2] = new Person();
        persons[3] = new Person();
        persons[3] = persons[0];
        persons[0] = myPerson;
        myPerson = persons[2];

        persons[1] = null;

    }
}