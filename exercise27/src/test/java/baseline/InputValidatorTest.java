package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {
    @Test
    void Validate_First_Name_False() {
       boolean actual = InputValidator.validateFirst("A");
       boolean expected = false;
       assertEquals(expected, actual);
    }

    @Test
    void Validate_First_Name_False_More() {
        boolean actual = InputValidator.validateFirst("  ");
        boolean expected = false;
        assertEquals(expected, actual);
    }


    @Test
    void Validate_First_Name_true() {
        boolean actual = InputValidator.validateFirst("Cristiam");
        boolean expected = true;
    }

    @Test
    void Validate_Last_Name_False() {
        boolean actual = InputValidator.validateLast("a");
        boolean expected = false;
        assertEquals(expected, actual);

    }

    @Test
    void Validate_Last_Name_False_More() {
        boolean actual = InputValidator.validateLast("  ");
        boolean expected = false;
        assertEquals(expected, actual);

    }

    @Test
    void Validate_Last_Name_True() {
        boolean actual = InputValidator.validateLast("Enciso");
        boolean expected = true;
        assertEquals(expected, actual);

    }

    @Test
    void Validate_ZIP_False() {
        boolean actual = InputValidator.validateZip("1234");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void Validate_ZIP_True() {
        boolean actual = InputValidator.validateZip("32901");
        boolean expected = true;
        assertEquals(expected, actual);

    }
    @Test
    void Validate_Employee_ID_False() {
        boolean actual = InputValidator.validateID("AC1234");
        boolean expected = false;
        assertEquals(expected, actual);

    }

    @Test
    void Validate_Employee_ID_True() {
        boolean actual = InputValidator.validateID("AC-1234");
        boolean expected = true;
        assertEquals(expected, actual);

    }
    @Test
    void isNumeric_True() {
        boolean actual = InputValidator.isNumeric("1234");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void isNumeric_False() {
        boolean actual = InputValidator.isNumeric("abcdef");
        boolean expected = false;
        assertEquals(expected, actual);
    }


    @Test
    void setFirst() {
        InputValidator.setFirst("Cristiam");
        String expected = "Cristiam";
        InputValidator valid = new InputValidator();
        assertEquals(expected, valid.getFirst());
    }

    @Test
    void setLast() {
        InputValidator.setLast("Enciso");
        String expected = "Enciso";
        InputValidator valid = new InputValidator();
        assertEquals(expected, valid.getLast());
    }

    @Test
    void setZip() {
        InputValidator.setZip("32901");
        String expected = "32901";
        InputValidator valid = new InputValidator();
        assertEquals(expected, valid.getZip());
    }

    @Test
    void setId() {
        InputValidator.setId("AB-1234");
        String expected = "AB-1234";
        InputValidator valid = new InputValidator();
        assertEquals(expected, valid.getId());
    }

    }


