package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import java.security.NoSuchAlgorithmException;
import java.util.List;

public class Solution35 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        ContestList contest = new ContestList();
        // get input from user to set array continuously til end condition
        List<String> strList = contest.getInput();
        // initialize an arrayList of person objects
        List<Person> participants = contest.initializeList(strList);
        String winner = contest.processWinner(contest.makeRandomNumber(participants.size()), participants);
        // generate random winner
        // print result
        System.out.println("The winner is ... " + winner + ".");

    }
}
