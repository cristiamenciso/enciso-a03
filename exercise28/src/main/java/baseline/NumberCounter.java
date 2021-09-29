package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import java.util.Scanner;

public class NumberCounter {
    // make an array of numbers objects
    Numbers[] numberArray = new Numbers[5];
    // set array with user input
    public void getInput() {
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            numberArray[i] = new Numbers(in.nextInt());
        }
        printOutput(addNumbers(numberArray));

    }
    // call add method
    public int addNumbers(Numbers[] array) {
        int result = 0;
        for (int i = 0; i < 5; i++) {
             result += array[i].getNum();
        }
        return result;
    }
    public void printOutput(int results) {
        System.out.printf("the total is: %d", results);
    }

}
