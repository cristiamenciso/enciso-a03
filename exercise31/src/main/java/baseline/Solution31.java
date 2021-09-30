package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

public class Solution31 {
    public static void main(String[] args) {
        KarvonenRate table = new KarvonenRate();
        // prompt user for input
        table.readUserInput();
        // calculate heart rate
        // print output
        table.printTable(table.getAge(), table.getRestRate());
    }
}
