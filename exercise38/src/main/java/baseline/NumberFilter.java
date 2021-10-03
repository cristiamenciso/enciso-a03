package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import java.util.ArrayList;
import java.util.List;

public class NumberFilter {
    // method to get input from user
    public String[] makeString(String str) {
        return str.split(" ");
    }
    // method to sort the input
    public Integer[] filterEvenNumbers(String str) {
        String[] input = makeString(str);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            int num = Integer.parseInt(input[i]);
            if (num % 2 == 0) {
                list.add(num);
            }
        }
        Integer[] intArray = new Integer[list.size()];
        intArray = list.toArray(intArray);
        return intArray;

    }
    // method to print out list
    public void printList(Integer[] list) {
        System.out.print("The even numbers are ");
        for(int i = 0; i < list.length; i++) {
            if(i < list.length - 1) {
                System.out.print(list[i] + " ");
            }
            else{
                System.out.print(list[i] + ".");
            }
        }
    }



}
