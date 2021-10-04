package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPayment() {
        PaymentCalculator calc = new PaymentCalculator();
        calc.setBalance(5000);
        calc.setAPR(12);
        calc.setMonthlyPayment(100);
        int actual = calc.calculateMonthsUntilPayment();
        int expected = 70;
        assertEquals(expected, actual);

    }

    @Test
    void setBalance() {
        PaymentCalculator test = new PaymentCalculator();
        test.setBalance(200.0);
        double actual = test.getBalance();
        double expected = 200.0;
        assertEquals(expected, actual);
    }

    @Test
    void setAPR() {
        PaymentCalculator test = new PaymentCalculator();
        test.setAPR(200.0);
        double actual = test.getAPR();
        double expected = 200.0;
        assertEquals(expected, actual);
    }

    @Test
    void setMonthlyPayment() {
        PaymentCalculator test = new PaymentCalculator();
        test.setMonthlyPayment(200.0);
        double actual = test.getMonthlyPayment();
        double expected = 200.0;
        assertEquals(expected, actual);
    }

    @Test
    void getBalance() {
        PaymentCalculator test = new PaymentCalculator();
        double actual = test.getBalance();
        double expected = 0.0;
        assertEquals(expected, actual);

    }

    @Test
    void getAPR() {
        PaymentCalculator test = new PaymentCalculator();
        double actual = test.getAPR();
        double expected = 0.0;
        assertEquals(expected, actual);
    }

    @Test
    void getMonthlyPayment() {
        PaymentCalculator test = new PaymentCalculator();
        double actual = test.getMonthlyPayment();
        double expected = 0.0;
        assertEquals(expected, actual);
    }
}