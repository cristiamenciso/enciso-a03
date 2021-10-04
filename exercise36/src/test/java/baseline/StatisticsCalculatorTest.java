package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsCalculatorTest {

    @Test
    void isNumeric() {
        StatisticsCalculator game = new StatisticsCalculator();
        boolean actual = game.isNumeric("123");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void average() {
        StatisticsCalculator test = new StatisticsCalculator();
        List<String> testList = new ArrayList<>();
        BigDecimal expected = new BigDecimal("400.0");
        testList.add("100");
        testList.add("200");
        testList.add("1000");
        testList.add("300");
        BigDecimal actual = test.average(testList);
        assertEquals(expected, actual);
    }

    @Test
    void minimum() {
        StatisticsCalculator test = new StatisticsCalculator();
        List<String> testList = new ArrayList<>();
        BigDecimal expected = new BigDecimal("100");
        testList.add("100");
        testList.add("200");
        testList.add("1000");
        testList.add("300");
        BigDecimal actual = test.min(testList);
        assertEquals(expected, actual);

    }

    @Test
    void maximum() {
        StatisticsCalculator test = new StatisticsCalculator();
        List<String> testList = new ArrayList<>();
        BigDecimal expected = new BigDecimal("1000");
        testList.add("100");
        testList.add("200");
        testList.add("1000");
        testList.add("300");
        BigDecimal actual = test.max(testList);
        assertEquals(expected, actual);

    }

    @Test
    void standardDeviation() {
        StatisticsCalculator test = new StatisticsCalculator();
        List<String> testList = new ArrayList<>();
        BigDecimal expected = new BigDecimal("353.55");
        testList.add("100");
        testList.add("200");
        testList.add("1000");
        testList.add("300");
        BigDecimal actual = test.std(testList);
        assertEquals(expected, actual);

    }
}