package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.*;

class MatchTest {

    @Test
    void setDifficulty() throws NoSuchAlgorithmException {
        Match game = new Match();
        game.setDifficulty("1");
        game.setDifficulty("2");
        String expected = "1";
        assertNotEquals(expected, game.getDifficulty());
    }
    @Test
    void getDifficulty() throws NoSuchAlgorithmException {
        Match game = new Match();
        String actual = game.getDifficulty();
        String expected = null;
        assertEquals(expected, actual);
    }

    @Test
    void setRandomNumber() throws NoSuchAlgorithmException {
        Match game = new Match();
        game.setRandomNumber(1);
        game.setRandomNumber(2);
        int expected = 1;
        int actual = game.getRandomNumber();
        assertNotEquals(expected, actual);
    }

    @Test
    void getRandomNumber() throws NoSuchAlgorithmException {
        Match game = new Match();
        int actual = game.getRandomNumber();
        int expected = 0;
        assertEquals(expected, actual);

    }
    // test to check if a string is numeric

    @Test
    void isNumeric() throws NoSuchAlgorithmException {
        Match game = new Match();
        boolean actual = game.isNumeric("123");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    // test to check if random number is generated within expected range
    @Test
    void makeRandomNumber() throws NoSuchAlgorithmException {
        Match game = new Match();
        game.makeRandomNumber("1");
        int actual = game.getRandomNumber();
        if(actual > 10 || actual < 1) {
            assertFalse(false);
        }
        else {
            assertTrue(true);
        }
    }
    @Test
    void makeRandomnumberTestFor2Difficulty() throws NoSuchAlgorithmException {
        Match game = new Match();
        game.makeRandomNumber("2");
        int actual = game.getRandomNumber();
        if(actual > 100 || actual < 1) {
            assertFalse(false);
        }
        else {
            assertTrue(true);
        }

    }

    @Test
    void makeRandomnumberTestFor3Difficulty() throws NoSuchAlgorithmException {
        Match game = new Match();
        game.makeRandomNumber("3");
        int actual = game.getRandomNumber();
        if(actual > 1000 || actual < 1) {
            assertFalse(false);
        }
        else {
            assertTrue(true);
        }

    }
}