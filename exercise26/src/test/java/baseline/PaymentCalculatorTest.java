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
}