package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */


import java.util.List;

public class EmployeeList {
    // class to organize employee class


    // method to initialize array list
    public List<Employee> initializeList(List<Employee> list) {
        Employee e1 = new Employee("John Smith");
        list.add(e1);
        Employee e2 = new Employee("Jackie Johnson");
        list.add(e2);
        Employee e3 = new Employee("Chris Jones");
        list.add(e3);
        Employee e4 = new Employee("Amanda Cullen");
        list.add(e4);
        Employee e5 = new Employee("Jeremy Goodwin");
        list.add(e5);
        return list;

    }
    public void removeEmployee(String employee, List<Employee> list) {
        list.removeIf(e -> e.getFullName().equals(employee));

    }
    public void printList(List<Employee> list) {
        System.out.printf("There are %d Employees%n", list.size());
        System.out.println();
        for(Employee e : list) {
            System.out.println(e.getFullName());
        }

    }
}
