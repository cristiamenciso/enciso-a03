package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import java.util.Scanner;

public class InputValidator {
    // make variables
    private static String r;


    // make constructor and get methods
    InputValidator() {

    }
    public static void setR(String r) {
        InputValidator.r = r;
    }

    public static String getR() {
        return r;
    }
    // method to validate input
    public static double validateInput() {
        double input = 0;
        while (true) {
            try {
                getInput();
                input = Double.parseDouble(getR());
                if (input == 0.0)
                    throw new IllegalArgumentException();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Sorry. that's not a valid input.");
            }
        }
        return input;
    }
    // method to calculate years
    public static int calculateYears(double r) {
        return (int)(72 / r);
    }
    public static void getInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the rate of return? ");
        setR(in.nextLine());

    }


}
