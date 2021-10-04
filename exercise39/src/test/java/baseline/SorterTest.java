package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class SorterTest {


    @Test
    // testing by seeing number of initialized elements
    void initializeList() {
        Sorter test = new Sorter();
        List<HashMap<String, Employee>> list = test.initializeList();
        int expected = 6;
        int actual = list.size();
        assertEquals(expected, actual);
    }

    @Test
    //Test ot see if list was sorted alphabetically by confirming first key is in order
    void sortList() {
        Sorter test = new Sorter();
        List<HashMap<String, Employee>> list = test.initializeList();
        List<TreeMap<String, Employee>> treeList = test.sortList(list);
        String expected = "Jackson";
        String actual = treeList.get(1).firstKey().toString();
        assertEquals(expected, actual);
    }
}