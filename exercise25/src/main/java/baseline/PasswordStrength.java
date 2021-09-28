package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import java.util.Scanner;

public class PasswordStrength {
    // make variable for password
    private String password;
    // make get and set methods

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    // method to get input from user
    public void getInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Password: ");
        setPassword(in.nextLine());
    }
    // make method to validate password
    public int passwordValidator(String password) {
        char[] chars = password.toCharArray();
        int intCounter = 0;
        int specCounter = 0;

        for(int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(chars[i]) && (!Character.isWhitespace(chars[i]))) {
                specCounter++;
            }
        }
        for(int i = 0; i < password.length(); i++) {
            if (Character.isDigit(chars[i])) {
                intCounter++;
            }
        }


        if((password.length() < 8) && intCounter == password.length() && specCounter == 0) {
            return 1; // 1 is a very weak password
        }
        else if((intCounter == 0) && (password.length() < 8 ) && (specCounter == 0 )){
            return 2; //2 is a weak password
        }
        else if((password.length() >= 8) && (intCounter >= 1) && (specCounter == 0)) {
            return 3; // 3 is a strong password
        }
        else if((password.length() >= 8) && (intCounter >= 1) && (specCounter >= 1)) {
            return 4; // very strong password
        }
        else {
            return 0;
        }

    }
    // make method to print out corresponding output
    public void outputResult(int process, String password){
        String str = "The password \'";
        if(process == 1){
            System.out.print(str + password + "\' is a very weak password.");
        }
        else if(process == 2) {
            System.out.print(str + password + "\' is a weak password.");
        }
        else if(process == 3) {
            System.out.print(str + password + "\' is a strong password.");
        }
        else if(process == 4) {
            System.out.print(str + password + "\' is a very strong password.");
        }
        else {
            System.out.print(" ");
        }

    }
}
