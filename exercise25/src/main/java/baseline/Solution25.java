package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

public class Solution25 {
    public static void main(String[] args) {
        PasswordStrength pass = new PasswordStrength();
        // Prompt user for password
        pass.getInput();
        // call function/method to validate strength of password
        int result = pass.passwordValidator(pass.getPassword());
        // print out results
        pass.outputResult(result, pass.getPassword());
    }
}
