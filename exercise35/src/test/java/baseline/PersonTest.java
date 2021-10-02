package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person test = new Person("Cristiam");
        String actual = test.getName();
        String expected = "Cristiam";
        assertEquals(expected, actual);
    }
    @Test
    void Person() {
        Person test = new Person("David");
        String actual = test.getName();
        String expected = "David";
        assertEquals(expected,actual);
    }
}