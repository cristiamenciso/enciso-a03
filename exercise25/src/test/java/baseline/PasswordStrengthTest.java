package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthTest {
    @Test
    void Password_validator_returns_1() {
        PasswordStrength validator = new PasswordStrength();
        int actual = validator.passwordValidator("12345");
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void Password_validator_returns_2() {
        PasswordStrength validator = new PasswordStrength();
        int actual = validator.passwordValidator("abcdef");
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void Password_validator_returns_3() {
        PasswordStrength validator = new PasswordStrength();
        int actual = validator.passwordValidator("abc123xyz");
        int expected = 3;
        assertEquals(expected, actual);

    }

    @Test
    void Password_validator_returns_4() {
        PasswordStrength validator = new PasswordStrength();
        int actual = validator.passwordValidator("1337h@xor");
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void setPassword() {
        PasswordStrength validator = new PasswordStrength();
        validator.setPassword("objects");
        String actual = validator.getPassword();
        String expected = ("objects");
        assertEquals(expected, actual);
    }

    @Test
    void getPassword() {
        PasswordStrength validator = new PasswordStrength();
        String actual = validator.getPassword();
        String expected = null;

    }
}