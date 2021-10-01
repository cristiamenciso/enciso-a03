package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution33 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        final int SIZE = 3;
        Scanner in = new Scanner(System.in);
        Magic8Ball ball = new Magic8Ball();
        // prompt user for a question
        System.out.print("What's your question? \n");
        in.next();
        // initialize an array with possible responses
        String[] realArray;
        String[] tempArray = new String[4];
        realArray = ball.initializeArray(tempArray);
        ball.shakeMagic8Ball(realArray, ball.makeRandomNumber(SIZE));
        // "shake" the magic 8-ball
        String result = ball.shakeMagic8Ball(realArray, ball.makeRandomNumber(SIZE));
        // print results
        ball.printOutput(result);
    }
 }
