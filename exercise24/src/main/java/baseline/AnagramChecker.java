package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import java.util.Scanner;

public class AnagramChecker {
    // make variables for anagram checker
    private String word1;
    private String word2;

    // Make set methods
    public void setWord1(String word1) {
        this.word1 = word1;
    }
    public void setWord2(String word2) {
        this.word2 = word2;
    }

    // make get methods
    public String getWord1() {
        return word1;
    }
    public String getWord2() {
        return word2;
    }
    // make method to check if two string are anagrams
    public boolean isAnagram() {
        if (getWord1().length() != getWord2().length()) {
            return false;
        }
        int charRange = 256;
        int count[] = new int[charRange];
        for (int i = 0; i < getWord1().length(); i++) {
            count[getWord1().charAt(i)]++;
            count[getWord1().charAt(i)]--;
        }
        for (int i = 0; i < charRange; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;

    }
    // Made input and output method in class for ease of access to variables

    public void getInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two strings and I'll tell you if they are anagrams: \nEnter the first string: ");
        setWord1(in.nextLine());
        System.out.print("Enter the second string: ");
        setWord2(in.nextLine());
    }
    public String printOutput(boolean result) {
        String output;
        if(result) {
            output = "\"" + getWord1() + "\"" + " amd " + "\"" + getWord2() + "\"" + " are anagrams.";
        }else {
            output = "\"" + getWord1() + "\"" + " amd " + "\"" + getWord2() + "\"" + " are not anagrams.";
        }

        return output;
    }
}
