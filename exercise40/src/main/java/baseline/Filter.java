package baseline;

import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Cristiam Enciso
 */


public class Filter {

    public List<HashMap<String, Employee>> initializeList() {
        List<HashMap<String, Employee>> list = new ArrayList<>();
        Employee e1 = new Employee("John", "Johnson", "Manager", "2016-12-31");
        HashMap<String, Employee> map1 = new HashMap<>();
        map1.put("Johnson", e1);
        list.add(map1);
        Employee e2 = new Employee("Tou", " Xiong", "Software Engineer", "2016-10-05");
        HashMap<String, Employee> map2 = new HashMap<>();
        map2.put("Xiong", e2);
        list.add(map2);
        Employee e3 = new Employee("Michaela", "Michaelson", "District Manager", "2015-12- 19");
        HashMap<String, Employee> map3 = new HashMap<>();
        map2.put("Michaelson", e3);
        list.add(map3);
        Employee e4 = new Employee("Jake", "Jacobson", "Programmer", "");
        HashMap<String, Employee> map4 = new HashMap<>();
        map2.put("Jacobson", e4);
        list.add(map4);
        Employee e5 = new Employee("Jacquelyn", "Jackson", "DBA", "");
        HashMap<String, Employee> map5 = new HashMap<>();
        map2.put("Jackson", e5);
        list.add(map5);
        Employee e6 = new Employee("Sally", "Webber", "Web Developer", "2015-12-18");
        HashMap<String, Employee> map6 = new HashMap<>();
        map2.put("Webber", e6);
        list.add(map6);
        return list;
    }
    public List<TreeMap<String, Employee>> sortList(List<HashMap<String, Employee>> list) {
        List<TreeMap<String, Employee>> treeList = new ArrayList<>();
        for(HashMap<String, Employee> hMap : list ) {
            TreeMap<String, Employee> treeMap = new TreeMap<>(hMap);
            treeList.add(treeMap);

        }
        return treeList;
    }

    // method to print output
    public void printList(List<HashMap<String, Employee>> list) {
        System.out.println("Name" + "                 |  " + "Position            |" + "   Separation Date            |");
        System.out.println("---------------------|----------------------|----------------------|");
        for(HashMap<String, Employee> m : list) {
            Collection<Employee> emp = m.values();
            for (Employee e : emp) {
                System.out.format("%-10s%-15s%-20s%-15s", e.getFirstName(), e.getLastName(), e.getRole(), e.getSeparationDate());
                System.out.println();

            }
        }
    }





}
