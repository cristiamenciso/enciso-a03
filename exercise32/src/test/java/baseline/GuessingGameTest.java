package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

class GuessingGameTest {

    @Test
    void setGuess_test() {
        GuessingGame game = new GuessingGame();
        game.setGuess("5");
        game.setGuess("25");
        assertNotEquals("5", game.getGuess());
    }

    @Test
    void getGuess() {
        GuessingGame game = new GuessingGame();
        String actual = game.getGuess();
        String expected = null;
        assertEquals(expected, actual);
    }
    @Test
    // tests by comparing number of counts on counter. if zero means guess is correct
    void processGuess_Test() {
        GuessingGame game = new GuessingGame();
        int actual = game.processGuess(5, "5");
        int expected  = 0;
        assertEquals(expected, actual);

    }
}