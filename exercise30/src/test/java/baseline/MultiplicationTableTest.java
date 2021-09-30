package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTableTest {

    @Test
    void makeTable_Test() {
        int[][] array = new int[12][12];
        MultiplicationTable table = new MultiplicationTable();
        int[][] multArray = table.makeTable(array);
        String actual = Arrays.deepToString(multArray);
        String expected = "[[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12], [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24], [3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36], [4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48], [5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60], [6, 12, 18, 24, 30, 36, 42, 48, 54, 60, 66, 72], [7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84], [8, 16, 24, 32, 40, 48, 56, 64, 72, 80, 88, 96], [9, 18, 27, 36, 45, 54, 63, 72, 81, 90, 99, 108], [10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120], [11, 22, 33, 44, 55, 66, 77, 88, 99, 110, 121, 132], [12, 24, 36, 48, 60, 72, 84, 96, 108, 120, 132, 144]]";
        assertEquals(expected, actual);


    }
}