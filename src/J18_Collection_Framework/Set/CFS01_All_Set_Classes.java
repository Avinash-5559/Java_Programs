package J18_Collection_Framework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CFS01_All_Set_Classes {
    public static void main(String[] args) {

        System.out.println("\n----------------------------- HASHSET -----------------------------\n");

        // HashSet is the mechanism is used to store the element.
        // HashSet does not any sorting order.
        // HashSet not allow duplicates element.

        Set<String> hs = new HashSet();

        hs.add("Apple");
        hs.add("WaterMelon");
        hs.add("Orange");
        hs.add("WaterMelon");
        //hs.add(123456);
        hs.add(null);
        hs.add(null);
        hs.add("orange");

        System.out.println("HashSet Items : " + hs);

        System.out.println("\n------------------------- LINKED HASH SET -------------------------\n");

        // LinkedHashSet is the mechanism is used to store the element.
        // LinkedHashSet will maintain the sorting order.
        // LinkedHashSet not allow duplicates element.

        Set lhs = new LinkedHashSet();

        lhs.add("Orange");
        lhs.add(789456);
        lhs.add("Apple");
        lhs.add("WaterMelon");
        lhs.add(null);
        lhs.add("WaterMelon");
        lhs.add("watermelon");

        System.out.println("Linked Hash Set Items                   : " + lhs);
        System.out.println("Does Linked Hash Set is Empty           : " + lhs.isEmpty());
        System.out.println("Linked Hash Set contain this Element    : " + lhs.contains("Apple"));
        System.out.println("Linked Hash Set Size                    : " + lhs.size());

        System.out.println("\n---------------------------- TREE SET ----------------------------\n");

        // TreeSet used Black and Red Tree mechanism to store the element.
        // TreeSet will maintain Natural sorting order (i.e. Ascending Order).
        // TreeSet not allow duplicates element.

        Set ts1 = new TreeSet();

        ts1.add("Orange");
        ts1.add("Apple");
        ts1.add("WaterMelon");
        ts1.add("Mango");
        ts1.add("Orange");
        //ts1.add(456987);                          // java.lang.ClassCastException
        //ts1.add(null);                            // java.lang.NullPointerException
        ts1.add("apple");

        System.out.println("Tree Set String Items   : " + ts1);

        Set ts2 = new TreeSet();

        ts2.add(765656);
        ts2.add(432386);
        ts2.add(12686);
        ts2.add(7635);
        //ts2.add("cherry");                        // java.lang.ClassCastException

        System.out.println("Tree Set Integer Items  : " + ts2);

        /*
          OUTPUT :
                    ----------------------------- HASHSET -----------------------------

                    HashSet Items : [null, orange, Apple, WaterMelon, Orange]

                    ------------------------- LINKED HASH SET -------------------------

                    Linked Hash Set Items                   : [Orange, 789456, Apple, WaterMelon, null, watermelon]
                    Does Linked Hash Set is Empty           : false
                    Linked Hash Set contain this Element    : true
                    Linked Hash Set Size                    : 6

                    ---------------------------- TREE SET ----------------------------

                    Tree Set String Items   : [Apple, Mango, Orange, WaterMelon, apple]
                    Tree Set Integer Items  : [7635, 12686, 432386, 765656]
        */

    }
}