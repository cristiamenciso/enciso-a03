package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

public class Solution26 {
    public static void main(String[] args) {
        PaymentCalculator calc = new PaymentCalculator();
        // get user input
        calc.getInput();
        // call method to calculate amount of time to pay off credit card
        int months = calc.calculateMonthsUntilPayment();
        Solution26 app = new Solution26();
        // print out results
        app.printOutput(months);


    }
    public void printOutput(int months) {
        System.out.printf("It will take you %d months to pay off this card.", months);
    }
}
