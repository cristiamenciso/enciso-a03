package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {

    @Test
    void PasswordGenerator() {
        PasswordGenerator pass = new PasswordGenerator("8", "8", "8");
        if(pass.getMinLength().equals("8") && pass.getSpecChar().equals("8") && pass.getNumOfNumbers().equals("8")) {
            assertTrue(true);
        }
        else {
            assertFalse(false);
        }


    }

    @Test
    void getMinLength() {
        PasswordGenerator pass = new PasswordGenerator();
        String actual = pass.getMinLength();
        String expected = null;
        assertEquals(expected, actual);
    }

    @Test
    void getSpecChar() {
        PasswordGenerator pass = new PasswordGenerator();
        String actual = pass.getSpecChar();
        String expected = null;
        assertEquals(expected, actual);
    }

    @Test
    void getNumOfNumbers() {
        PasswordGenerator pass = new PasswordGenerator();
        String actual = pass.getNumOfNumbers();
        String expected = null;
        assertEquals(expected, actual);
    }

    @Test
    void generatePassword() {
        PasswordGenerator pass = new PasswordGenerator();
        String actual = pass.generatePassword("8", "2", "2");
        boolean test = actual.matches("^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");

        assertTrue(test);

    }
}