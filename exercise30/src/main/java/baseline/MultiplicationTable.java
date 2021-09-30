package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

public class MultiplicationTable {
    // method to generate a table
    public int[][] makeTable(int[][] array) {
        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 12; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return array;
    }
    // method to display table
    public void displayTable(int[][] array) {
        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 12; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }



    }
    

}
