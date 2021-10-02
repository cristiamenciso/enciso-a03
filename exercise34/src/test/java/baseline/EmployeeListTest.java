package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListTest {

    @Test
    void initializeList() {
        Employee worker = new Employee();
        EmployeeList org = new EmployeeList();
        List<Employee> tempList = new ArrayList<>();
        List<Employee> realList = new ArrayList<>();
        realList = org.initializeList(tempList);
        StringBuilder str = new StringBuilder();
        String expected = "John SmithJackie JohnsonChris JonesAmanda CullenJeremy Goodwin";
        for(Employee e : realList) {
            str.append(e.getFullName());
        }
        assertEquals(expected, str.toString());

    }

    @Test
    void removeEmployee() {
        Employee worker = new Employee();
        EmployeeList org = new EmployeeList();
        List<Employee> tempList = new ArrayList<>();
        List<Employee> realList = new ArrayList<>();
        realList = org.initializeList(tempList);
        int expected = 4;
        org.removeEmployee("John Smith", realList);
        assertEquals(expected, realList.size());



    }

}