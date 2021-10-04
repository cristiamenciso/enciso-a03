package baseline;

import java.util.*;

public class Solution39 {
    public static void main(String[] args) {
        Sorter sort = new Sorter();
        // initialize map lists
        List<TreeMap<String, Employee>> treeList;
        List<HashMap<String, Employee>> list = sort.initializeList();
        sort.printList(list);
        // sort list by converting hashmap to tree map
        treeList = sort.sortList(list);
        System.out.println();
        // print out sorted list
        sort.printTreeList(treeList);

    }
}
