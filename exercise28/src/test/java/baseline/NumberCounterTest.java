package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberCounterTest {

    @Test
    void addNumbers() {
        Numbers[] numArr = new Numbers[5];
        for (int i = 0; i < 5; i++) {
            numArr[i] = new Numbers(i + 1);
        }
        NumberCounter counter = new NumberCounter();
        int actual = counter.addNumbers(numArr);
        int expected = 15;
        assertEquals(expected, actual);
    }

}