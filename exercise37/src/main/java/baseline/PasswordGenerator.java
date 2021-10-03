package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

public class PasswordGenerator {
    private String minLength;
    private String specChar;
    private String numOfNumbers;

    public PasswordGenerator(String length, String special, String numbers) {
        this.minLength = length;
        this.specChar = special;
        this.numOfNumbers = numbers;
    }
    // make get methods

    public String getMinLength() {
        return minLength;
    }

    public String getSpecChar() {
        return specChar;
    }

    public String getNumOfNumbers() {
        return numOfNumbers;
    }
    // method to generate password
    public String generatePassword(String length, String special, String numbers) {

    }
}
