package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */


import java.util.Scanner;

public class PaymentCalculator {
    // make private variables
    private double balance;
    private double apr;
    private double monthlyPayment;

    // make get ans set methods
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setAPR(double apr) {
        this.apr = apr;
    }
    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
    public double getBalance() {
        return balance;
    }
    public double getAPR() {
        return apr;
    }
    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void getInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your balance? ");
        setBalance(in.nextDouble());
        System.out.print("What is the APR on the card (as a percent)? ");
        setAPR(in.nextDouble());
        System.out.print("What is the monthly payment you can make? ");
        setMonthlyPayment(in.nextDouble());
    }

    public int calculateMonthsUntilPayment() {
        double adapr = (getAPR() / 100.0) / 365.0;
        double first = -(1.0/30.0);
        double second = Math.log((1 + getBalance() / getMonthlyPayment() * (1-(Math.pow((1 + adapr), 30)))));
        double third = Math.log(1 + adapr);

        return (int)Math.ceil((first * second) / third);

    }
}
