package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Magic8Ball {
    private Random rand = SecureRandom.getInstanceStrong();

    public Magic8Ball() throws NoSuchAlgorithmException {
        // method that allows for random secure number generator
    }

    // method to initialize String array
    public String[] initializeArray(String[] array) {
        String[] tempArray = new String[] {"Yes,", "No,", "Maybe", "Ask again later."};
        System.arraycopy(tempArray, 0, array, 0, 4);
        return array;
    }

    // method to get a response from magic 8 ball
    public String shakeMagic8Ball(String[] array, int randomNum) {
        return array[randomNum];
    }
    // method to generate a random number
    public int makeRandomNumber(int size) {
       return this.rand.nextInt(size);
    }
    // Method to print out answer
    public void printOutput(String result) {
        System.out.println(result);


    }
}
