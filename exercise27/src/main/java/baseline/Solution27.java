package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */


public class Solution27 {

    public static void main(String[] args ) {
        InputValidator valid = new InputValidator();
        // Prompt user for input
        InputValidator.getInput();
        // call method to validate input
        InputValidator.validateInputs(valid.getFirst(), valid.getLast(), valid.getZip(), valid.getId());
        // print results
    }
}
