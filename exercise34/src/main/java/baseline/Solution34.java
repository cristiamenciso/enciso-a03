package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        EmployeeList test= new EmployeeList();
        List<Employee> tempList = new ArrayList<>();
        List<Employee> realList;
        // initialize arraylist of employee objects
        realList= test.initializeList(tempList);
        // call method to print out the all employees
        test.printList(realList);
        System.out.print("\nEnter an employee name to remove: ");
        String employee = in.nextLine();
        // call method to remove employee by name
        test.removeEmployee(employee, realList);
        // print out the remaining employees
        test.printList(realList);

    }

}
