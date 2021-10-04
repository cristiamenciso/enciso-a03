package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */
public class Solution29 {
    public static void main(String[] args) {
        // get user input
        // validate user input
        double rate= InputValidator.validateInput();
        // print out results
        System.out.printf("It will take you %d years to double your initial investment", InputValidator.calculateYears(rate));



    }
}
