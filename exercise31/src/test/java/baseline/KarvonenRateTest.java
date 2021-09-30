package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenRateTest {

    @Test
    // testing calculation of heart rate
    void calculations_Test() {
        KarvonenRate rate = new KarvonenRate();
        double actual = rate.calculations(22, 65, 55 );
        double expected = 138.0;
        assertEquals(expected, actual);
    }

    @Test
    // testing if the method changes the value of variable
    void setAge() {
        KarvonenRate rate = new KarvonenRate();
        rate.setAge(25);
        rate.setAge(55);
        int actual = rate.getAge();
        int expected = 25;
        assertNotEquals(expected, actual);
    }

    @Test
    void setRestRate() {
        KarvonenRate rate = new KarvonenRate();
        rate.setRestRate(65);
        rate.setRestRate(55);
        int actual = rate.getAge();
        int expected = 65;
        assertNotEquals(expected, actual);
    }

    @Test
    // Testing to see if expected value is return
    void getAge() {
        KarvonenRate rate = new KarvonenRate();
        int actual = rate.getAge();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void getRestRate() {
        KarvonenRate rate = new KarvonenRate();
        int actual = rate.getRestRate();
        int expected = 0;
        assertEquals(expected, actual);
    }
}