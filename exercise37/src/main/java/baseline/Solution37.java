package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import java.util.Scanner;

public class Solution37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Whats the minimum length? ");
        String length = in.nextLine();
        System.out.print("How many special characters? ");
        String special = in.nextLine();
        System.out.print("How many numbers? ");
        String numbers = in.nextLine();
        PasswordGenerator pass = new PasswordGenerator(length, special, numbers);
        // call method to generate random password
        String password = pass.generatePassword(pass.getMinLength(), pass.getSpecChar(), pass.getNumOfNumbers());
        // print results
        System.out.print("Your password is " + password);

    }
}
