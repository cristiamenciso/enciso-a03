package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    /*
     *  UCF COP3330 Fall 2021 Assignment 3 Solutions
     *  Copyright 2021 Cristiam Enciso
     */


    @Test
    void getFirstName() {
        Employee test = new Employee("Cristiam", "Enciso", "Manager", "09/29/1994");
        String actual = test.getFirstName();
        String expected = "Cristiam";
        assertEquals(expected, actual);
    }

    @Test
    void setFirstName() {
        Employee test = new Employee("Cristiam", "Enciso", "Manager", "09/29/1994");
        test.setFirstName("Mario");
        String actual = test.getFirstName();
        String expected = "Mario";
        assertEquals(expected, actual);

    }

    @Test
    void getLastName() {
        Employee test = new Employee("Cristiam", "Enciso", "Manager", "09/29/1994");
        String actual = test.getLastName();
        String expected = "Enciso";
        assertEquals(expected, actual);
    }

    @Test
    void setLastName() {
        Employee test = new Employee("Cristiam", "Enciso", "Manager", "09/29/1994");
        test.setLastName("sixtyfour");
        String actual = test.getLastName();
        String expected = "sixtyfour";
        assertEquals(expected, actual);

    }

    @Test
    void getRole() {
        Employee test = new Employee("Cristiam", "Enciso", "Manager", "09/29/1994");
        String actual = test.getRole();
        String expected = "Manager";
        assertEquals(expected, actual);
    }



    @Test
    void setRole() {
        Employee test = new Employee("Cristiam", "Enciso", "Manager", "09/29/1994");
        test.setRole("Peon");
        String actual = test.getRole();
        String expected = "Peon";
        assertEquals(expected, actual);

    }

    @Test
    void getSeparationDate() {
        Employee test = new Employee("Cristiam", "Enciso", "Manager", "09/29/1994");
        String actual = test.getSeparationDate();
        String expected = "09/29/1994";
        assertEquals(expected, actual);
    }

    @Test
    void setSeparationDate() {
        Employee test = new Employee("Cristiam", "Enciso", "Manager", "09/29/1994");
        test.setSeparationDate("10-03-2021");
        String actual = test.getSeparationDate();
        String expected = "10-03-2021";
        assertEquals(expected, actual);

    }
}