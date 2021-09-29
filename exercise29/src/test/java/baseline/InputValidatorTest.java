package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

    @Test
    void getR() {
        InputValidator.setR("12");
        String expected = "12";
        String actual = InputValidator.getR();
        assertEquals(expected, actual);
    }
    @Test
    void setR() {
        InputValidator.setR("35");
        String expected = "35";
        String actual = InputValidator.getR();
        assertEquals(expected, actual);

    }

    @Test
    void validateInput() {
        double actual = InputValidator.validateInput();
        double expected = Double.parseDouble(InputValidator.getR());
        assertEquals(expected, actual);
    }

    @Test
    void calculateYears() {
        int actual  = InputValidator.calculateYears(4);
        int expected = 18;
        assertEquals(expected, actual);

    }
}