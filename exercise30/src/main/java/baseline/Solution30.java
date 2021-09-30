package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

public class Solution30 {
    public static void main(String[] args) {
        MultiplicationTable table = new MultiplicationTable();
        // initiade 2 dimensional array
        int[][] array = new int[12][12];
        // method to make the multiplication table on the 2d array
        int[][] multArray =  table.makeTable(array);
        // call function to print out table
        table.displayTable(multArray);

    }
}
