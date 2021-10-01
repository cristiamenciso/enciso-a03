package baseline;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */
public class Match {
    private Random rand = SecureRandom.getInstanceStrong();
    private String difficulty;
    private int randomNumber;

    public Match() throws NoSuchAlgorithmException {
        // to be able to use secure random for random number generator
    }

    // make get and set methods for match class

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getDifficulty() {

        return difficulty;
    }

    public void setRandomNumber(int randomNumber) {

        this.randomNumber = randomNumber;
    }

    public int getRandomNumber() {

        return randomNumber;
    }
    // method  to validate inputs
    public boolean isNumeric(String str) {
        if(str == null) {
            return false;
        }
        try {
            Double.parseDouble(str);
        } catch(NumberFormatException nfe) {
            return false;
        }
        return true;

    }
    // method to get difficulty from user
    public void getInput() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Let's play Guess the Number! ");
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            setDifficulty(in.nextLine());
            if (!isNumeric(getDifficulty())) {
                throw new Exception();
            }
        }
            catch(Exception e) {
                do {
                    System.out.print("Please enter a numeric value: ");
                    setDifficulty(in.next());
                } while (!isNumeric(getDifficulty()));
            }
    }
    public void makeRandomNumber(String difficulty) {
        if(difficulty.equals("1")) {
            setRandomNumber(this.rand.nextInt(10) + 1);
        }
        else if(difficulty.equals("2")) {
            setRandomNumber(this.rand.nextInt(100) + 1);
        }
        else if(difficulty.equals("3")) {
            setRandomNumber(this.rand.nextInt(1000) + 1);
        }

    }


}
