package baseline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */


public class Solution40 {
    public static void main(String[] args) {
        Filter sort = new Filter();
        Scanner in = new Scanner(System.in);
        // prompt user for search string
        System.out.print("Enter a search String: ");
        String search = in.nextLine();
        // initialize worker list
        List<HashMap<String, Employee>> list = sort.initializeList();
        // comb though list to find employee last name
        // print out tabular results
        sort.printList(list);
    }
}
