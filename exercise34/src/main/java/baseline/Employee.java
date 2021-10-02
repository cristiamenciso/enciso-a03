package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */


public class Employee {
    private String fullName;

    // make a constructor for employee class
    public Employee(String name) {
        this.fullName = name;
    }

    public Employee() {

    }

    // make get methods for employee
    public String getFullName() {
        return fullName;
    }
}
