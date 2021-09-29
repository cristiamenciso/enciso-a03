package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */


import java.util.Scanner;


public class InputValidator {
    // make variables to hold input
    private static String first;
    private static String last;
    private static String zip;
    private static String id;




    // make get methods for the variables

    public static void setFirst(String first) {
        InputValidator.first = first;
    }

    public String getFirst() {
        return first;
    }

    public static void setLast(String last) {
        InputValidator.last = last;
    }

    public String getLast() {
        return last;
    }

    public static void setZip(String zip) {
        InputValidator.zip = zip;
    }

    public String getZip() {
        return zip;
    }

    public static void setId(String id) {
        InputValidator.id = id;
    }

    public String getId() {
        return id;
    }

    // method to get input from user
    public static void getInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        setFirst(in.nextLine());
        System.out.print("Enter the last name: ");
        setLast(in.nextLine());
        System.out.print("Enter the ZIP code: ");
        setZip(in.nextLine());
        System.out.print("Enter the employee id: ");
        setId(in.nextLine());


    }
    // make methods to validate input
    public static boolean validateFirst(String first) {
        if (first.length() < 2) {
            System.out.println( "The first name must be at least 2 characters long.");
            return false;
        }

        else if (first.isBlank()) {
            System.out.println("The first name must be filled in.");
            return false;
        }
        else{
            return true;
        }

    }
    public static boolean validateLast(String last) {
        if (last.length() < 2) {
            System.out.println("The last name must be at least 2 characters long.");
            return false;
        }
       else if (last.isBlank()) {
            System.out.println("The last name must be filled in.");
            return false;
        }
        else {
            return true;
        }
    }
    public static boolean validateZip(String zip) {
        if(!isNumeric(zip)) {
            System.out.println("ZIP code must be numeric");
            return false;
        }
        else if (zip.length() != 5) {
            System.out.println("The zipcode must be a 5 digit number");
            return false;
        }
        else {
            return true;
        }

    }
    public static boolean validateID(String id) {
        if(!id.matches("[A-Z][A-Z]-[0-9][0-9][0-9][0-9]")) {
            System.out.println("The employee ID must be in the format of AA-1234.");
            return false;
        }
        return true;
    }
    // Method to consolidate all validated inputs and print results
    public static void validateInputs(String first, String last, String zip, String id) {
        boolean bool1 = validateFirst(first);
        boolean bool2 = validateLast(last);
        boolean bool3 = validateZip(zip);
        boolean bool4 =validateID(id);
        if(bool1 && bool2 && bool3 && bool4){
            System.out.println("There were no errors found.");
        }

    } // method to see if a string is numeric
    public static boolean isNumeric(String str) {
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
}
