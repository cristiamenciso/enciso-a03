package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import java.util.List;

public class Solution36 {
    public static void main(String[] args) {
        StatisticsCalculator test = new StatisticsCalculator();
        // get input from the user
        List<String> list = test.getInput();
        // print out the numbers
        test.displayNumbers(list);
        // calculate average
        // calculate
        // calculate minimum
        // Calculate standard deviation
        test.printResults(test.average(list), test.minimum(list), test.maximum(list), test.standardDeviation(list));
        // print out results
    }
}
