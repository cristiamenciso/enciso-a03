package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import java.util.Scanner;
public class Solution24 {
    static AnagramChecker checker;
    public static void main(String[] args) {
        AnagramChecker checker = new AnagramChecker();
        // Prompt user for input
        checker.getInput();
        // Call method to determine if strings are anagrams
        // Display results
        checker.printOutput(checker.isAnagram(checker.getWord1(), checker.getWord2()));

    }

}
