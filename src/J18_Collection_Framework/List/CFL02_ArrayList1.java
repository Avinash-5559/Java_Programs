package J18_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class CFL02_ArrayList1 {
    public static void main(String[] args) {

        List list = new ArrayList();

                                // INDEXING NUMBER

        list.add("1");          // 0
        list.add("2");          // 1
        list.add("3");          // 2
        list.add("3");          // 3
        list.add(4);            // 4
        list.add(true);         // 5
        list.add("3");          // 6

        System.out.println("ArrayList Size                          : " + list.size());
        System.out.println("Does ArrayList is Empty                 : " + list.isEmpty());
        System.out.println("ArrayList Contain this Value            : " + list.contains("1"));
        System.out.println("ArrayList Contain this Value            : " + list.contains(1));
        System.out.println("First occurrence Element in ArrayList   : " + list.indexOf("3"));           // Showing the Indexing Number in the Output
        System.out.println("Last occurrence Element in ArrayList    : " + list.lastIndexOf("3"));    // Showing the Indexing Number in the Output
        System.out.println("ArrayList Items                         : " + list);

        /*
            OUTPUT :

                    ArrayList Size                          : 7
                    Does ArrayList is Empty                 : false
                    ArrayList Contain this Value            : true
                    ArrayList Contain this Value            : false
                    First occurrence Element in ArrayList   : 2                         // It is the Indexing Number
                    Last occurrence Element in ArrayList    : 6                         // It is the Indexing Number
                    ArrayList Items                         : [1, 2, 3, 3, 4, true, 3]
        */

        System.out.println("\n-------------------- ARRAYLIST ITEMS --------------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /*
            OUTPUT :

                    -------------------- ARRAYLIST ITEMS --------------------
                    1
                    2
                    3
                    3
                    4
                    true
                    3
        */

    }
}