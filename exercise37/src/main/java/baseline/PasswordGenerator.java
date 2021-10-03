package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PasswordGenerator {
    private String minLength;
    private String specChar;
    private String numOfNumbers;

    public PasswordGenerator(String length, String special, String numbers) {
        this.minLength = length;
        this.specChar = special;
        this.numOfNumbers = numbers;
    }

    public PasswordGenerator() {
        // constructor to instantiate

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
        Random random = new Random();
        List<Character> character = new ArrayList<>();
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$%^&*";
        String num = "1234567890";
        for(int i = 0; i < Integer.parseInt(special); i++) {
            character.add(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
        }
        for(int i = 0; i < Integer.parseInt(numbers); i++) {
            character.add(num.charAt(random.nextInt(num.length())));
        }
        for(int i = character.size() - 1; i < Integer.parseInt(length); i++) {
            character.add(letters.charAt(random.nextInt(letters.length())));
        }
        Collections.shuffle(character);
        String password = "";

        for(Character s : character) {
            password += Character.toString(s);
        }
        return password;
    }
}
