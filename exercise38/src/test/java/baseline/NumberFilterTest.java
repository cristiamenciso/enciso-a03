package baseline;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

class NumberFilterTest {

    @Test
    void filterEvenNumbers() {
        NumberFilter filter = new NumberFilter();
        String str = "1 2 3 4 5 6 7 8";
        Integer[] actual = filter.filterEvenNumbers(str);
        String expected = "[2, 4, 6, 8]";
        assertEquals(expected, Arrays.toString(actual));


    }

    @Test
    void makeString() {
        NumberFilter test = new NumberFilter();
        String str = "1 2 3 4 5 6 7 8";
        String[] newStr = test.makeString(str);
        String expected = "[1, 2, 3, 4, 5, 6, 7, 8]";
        String actual = Arrays.toString(newStr);
        assertEquals(expected, actual);
    }
}