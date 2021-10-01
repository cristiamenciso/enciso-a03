package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class GuessingGame {
    private String guess;

    // get and set methods


    public void setGuess(String guess) {
        this.guess = guess;
    }

    public String getGuess() {
        return guess;
    }
    // prompt user for a number
    public int userGuess() throws NoSuchAlgorithmException {
        Scanner in = new Scanner(System.in);
        Match game = new Match();
        game.getInput();
        game.makeRandomNumber(game.getDifficulty());
        System.out.printf("This is the random number: %d%n", game.getRandomNumber());
        try {
            System.out.print("I have my number. WHat's your guess? ");
            setGuess(in.nextLine());
            if(!game.isNumeric(getGuess())) {
                throw new Exception();
            }
        }
            catch(Exception e) {
                do {
                    System.out.print("Please enter a numeric value: ");
                    setGuess(in.next());
                } while (!game.isNumeric(getGuess()));
            }
        return processGuess(game.getRandomNumber(), getGuess());
    }

    // process the guess
    public int processGuess(int randomNum, String guess) {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        while(Integer.parseInt(guess) != randomNum ) {
            if(Integer.parseInt(guess) < randomNum) {
                System.out.print("Too low. Guess again:");
                guess = in.nextLine();
                counter++;
            }
            else if(Integer.parseInt(guess) > randomNum) {
                System.out.print("Too high. Guess again: ");
                guess = in.nextLine();
                counter++;
            }
        }
        printResult(counter);
        return counter;
    }


    // print out the results of the game
    public void printResult(int counter) {
        System.out.printf("You got it in %d guesses!", counter);
    }

}
