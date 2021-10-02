package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ContestList {
    private Random rand = SecureRandom.getInstanceStrong();

    public ContestList() throws NoSuchAlgorithmException {
        // Constructor method to be able to use SecureRandom
    }

   public List<Person> initializeList(List<String> stringList) {
        List<Person> list = new ArrayList<>();
        for(String str : stringList) {
            Person per = new Person(str);
            list.add(per);
        }
        return list;


    }
    public List<String> getInput() {
        Scanner in = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        String str;
        do {
            System.out.print("Enter a name: ");
            str = in.nextLine();
            stringList.add(str);
        } while(!str.equals(""));

        return stringList;
    }

   public int makeRandomNumber(int size) {
        return this.rand.nextInt(size);
    }



     public String processWinner(int number, List<Person>list) {
        String winner = null;
        for(int i = 0; i < list.size(); i++) {
            if(i == number) {
                winner = list.get(i).getName();
            }
        }
        return winner;
    }

}
