package baseline;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class FilterTest {

    /*
     *  UCF COP3330 Fall 2021 Assignment 3 Solutions
     *  Copyright 2021 Cristiam Enciso
     */


    @Test
        // testing by seeing number of initialized elements
    void initializeList() {
        Filter test = new Filter();
        List<HashMap<String, Employee>> list = test.initializeList();
        int expected = 6;
        int actual = list.size();
        assertEquals(expected, actual);
    }
    @Test
    void sortList() {
        Filter test = new Filter();
        List<HashMap<String, Employee>> list = test.initializeList();
        List<TreeMap<String, Employee>> treeList = test.sortList(list);
        String expected = "Jackson";
        String actual = treeList.get(1).firstKey().toString();
        assertEquals(expected, actual);
    }
}