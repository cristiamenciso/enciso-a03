package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */
import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContestListTest {

    @Test
    void initializeList() throws NoSuchAlgorithmException {
        ContestList contest = new ContestList();
        List<String> stringTest = new ArrayList<>();
        List<Person> actual;
        stringTest.add("Cristiam");
        stringTest.add("David");
        String expected ="CristiamDavid";
        actual = contest.initializeList(stringTest);
        StringBuilder str = new StringBuilder();
        for(Person p : actual) {
            str.append(p.getName());
        }
        assertEquals(expected, str.toString());
    }

    @Test
    void processWinner() throws NoSuchAlgorithmException {
        List<Person> test = new ArrayList<>();
        Person p1 = new Person("Cristiam");
        Person p2 = new Person("David");
        test.add(p1);
        test.add(p2);
        String expected = "David";
        ContestList contest = new ContestList();
        String actual = contest.processWinner(1, test);
        assertEquals(expected, actual);



    }

    @Test
    void makeRandomNumber() throws NoSuchAlgorithmException {
            ContestList list = new ContestList();
            int actual = list.makeRandomNumber(3);
            if(actual > 3 || actual < 1) {
                assertFalse(false);
            }
            else {
                assertTrue(true);
            }
        }

}