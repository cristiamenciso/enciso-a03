package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import java.util.Scanner;

public class Solution38 {
    public static void main(String[] args) {
        NumberFilter filter = new NumberFilter();
        // prompt user for String array
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a list of numbers separated by a spaces: ");
        String numbers = in.nextLine();
        // call method to sort array by even numbers
        Integer[] evenList = filter.filterEvenNumbers(numbers);
        // print out results
        filter.printList(evenList);

    }
}
