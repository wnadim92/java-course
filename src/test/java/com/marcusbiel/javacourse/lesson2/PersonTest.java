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
        for (int i = 0; i < 4; i++) {
            persons[i] = new Person();
            persons[i].printHelloName(""+i);
        }

        int i = 0;
        for(Person person: persons) {
            person.printHelloName(""+ i);
            i++;
        }

        Person myPerson = new Person();
        Person myPerson2 = null;
        final Person[] persons2 = {persons[0], null, persons[1], persons[2], myPerson, myPerson2, persons[3]};
        persons2[2] = persons[2];

        if (persons2[2].equals(persons[2])) {
            System.out.println("true");
        }

    }


}