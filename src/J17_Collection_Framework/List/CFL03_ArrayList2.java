package J17_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CFL03_ArrayList2 {
    public static void main(String[] args) {

        List list = new ArrayList();

                                    // INDEXING NUMBER

        list.add("bread");          // 0
        list.add("milk");           // 1
        list.add("butter");         // 2
        list.add("paneer");         // 3
        list.add("jam");            // 4
        list.add("cheeze");         // 5
        list.add(123);              // 6
        list.add(true);             // 7

        System.out.println("ArrayList Items                 : " + list);
        System.out.println("ArrayList Size                  : " + list.size());
        System.out.println("Does ArrayList is Empty         : " + list.isEmpty());
        System.out.println("ArrayList contains this value   : " + list.contains("1"));

        /*
            OUTPUT :
                    ArrayList Items                 : [bread, milk, butter, paneer, jam, cheeze, 123, true]
                    ArrayList Size                  : 8
                    Does ArrayList is Empty         : false
                    ArrayList contains this value   : false
        */

        System.out.println("\n-------------------- DEFAULT FOR LOOP --------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /*
            OUTPUT :
                    -------------------- DEFAULT FOR LOOP --------------------
                    bread
                    milk
                    butter
                    paneer
                    jam
                    cheeze
                    123
                    true
        */

        System.out.println("\n-------------------- FOR EACH LOOP --------------------");
        for (Object o : list) {
            System.out.println(o);
        }

        /*
            OUTPUT :
                    -------------------- FOR EACH LOOP --------------------
                    bread
                    milk
                    butter
                    paneer
                    jam
                    cheeze
                    123
                    true
         */

        System.out.println("\n-------------------- ITERATOR LOOP --------------------");

        /*
            Iterator     -> It is type of Anchor (Cursor or Arrow) - Go One by One Forward and Get Access Them.
                         -> It is used in all Interfaces of the Collection
                         -> Two Functions mostly used such as :

                            1) HasNext()    -> If it is true then we have a next element
                            2) Next         -> element
         */

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*
                OUTPUT :
                        -------------------- ITERATOR LOOP --------------------
                        bread
                        milk
                        butter
                        paneer
                        jam
                        cheeze
                        123
                        true
        */

    }
}