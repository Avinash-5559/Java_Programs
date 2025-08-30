package J17_Collection_Framework.List;

    /*
        ---------------------------------------- NOTES ----------------------------------------

        In Selenium : If doing, Add/Insertion and Deletion the elements then used -> Linked List

        In API      : If doing, Search/Access and Update the elements fast then used -> Array List
    */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CFL07_LinkedList {
    public static void main(String[] args) {

        //-------------------- ArrayList is like an Array Format which store in Continuous manner --------------------

        List mylist0 = new ArrayList(5);
        List mylist1 = new ArrayList();


        //----------------- LinkedList is like an ArrayList but store in Doubly Linked List manner -----------------

        List mylist2 = new LinkedList();

                                    // INDEXING NUMBER

        mylist2.add("Pramod");      // 0
        mylist2.add("Dutta");       // 1
        mylist2.add("Amit");        // 2
        mylist2.add("Meenu");       // 3
        mylist2.add("Ritwik");      // 4
        mylist2.add("ritwik");      // 5
        mylist2.add(null);          // 6
        mylist2.add(true);          // 7
        mylist2.add(123456);        // 8
        mylist2.add("Dutta");       // 9

        System.out.println("Linked List Items                       : " + mylist2);
        System.out.println("Does LinkedList is Empty                : " + mylist2.isEmpty());
        System.out.println("LinkedList Size                         : " + mylist2.size());
        System.out.println("LinkedList Contain this Value           : " + mylist2.contains("Dutta"));
        System.out.println("First occurrence Element in LinkedList  : " + mylist2.indexOf("Dutta"));
        System.out.println("Last occurrence Element in LinkedList   : " + mylist2.lastIndexOf("Dutta"));

        /*
            OUTPUT :
                    Linked List Items                       : [Pramod, Dutta, Amit, Meenu, Ritwik, ritwik, null, true, 123456, Dutta]
                    Does LinkedList is Empty                : false
                    LinkedList Size                         : 10
                    LinkedList Contain this Value           : true
                    First occurrence Element in LinkedList  : 1
                    Last occurrence Element in LinkedList   : 9
        */

    }
}