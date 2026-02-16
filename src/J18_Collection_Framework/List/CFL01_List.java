package J18_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class CFL01_List {
    public static void main(String[] args) {

        System.out.println("\n-------------- LIST INTERFACE ---------------");

        // List is an Interface, and they already have some Default Methods & Static Methods like below :

        List fruits = List.of("orange", "apple", "banana", "mango", "watermelon");
        System.out.println("List of Fruits : " + fruits);

        // Cannot modify the methods because Abstract Methods are incomplete under the Interface like below :

        /*

            fruits.add("cherry");            "add" Not possible due to java.lang.UnsupportedOperationException
            fruits.remove("apple");          "remove" Not possible due to java.lang.UnsupportedOperationException

        */

        /*
            OUTPUT :
                    -------------- LIST INTERFACE ---------------
                    List of Fruits : [orange, apple, banana, mango, watermelon]
        */

        System.out.println("\n--------------- ARRAY LIST -------------");

        ArrayList arrayList = new ArrayList();

        arrayList.add("avinash");           // Strings value is allowed
        arrayList.add(null);                // null value is allowed
        arrayList.add("sinha");
        arrayList.add("sinha");             // Duplicate value is allowed
        arrayList.add(12345);               // Different data type is allowed
        arrayList.add(true);                // Boolean value is allowed
        //arrayList.remove(null);

        System.out.println("List of Add     : " + arrayList);
        System.out.println("Array List Size : " + arrayList.size());

        /*
            OUTPUT :
                    --------------- ARRAY LIST -------------
                    List of Add     : [avinash, null, sinha, sinha, 12345, true]
                    Array List Size : 6
        */

        System.out.println("\n--------------- METHOD OVER RIDING OR DYNAMIC DISPATCH ---------------");

        List list = new ArrayList();       // Method Over Riding OR Dynamic Dispatch

        list.add(45678);                   // Integers value is allowed
        list.add("value");                 // Strings value is allowed
        //list.remove("value");

        System.out.println("Dynamic Dispatch List items         : " + list);
        System.out.println("Dynamic Dispatch List items size    : " + list.size());

        /*
            OUTPUT :
                    --------------- METHOD OVER RIDING OR DYNAMIC DISPATCH ---------------
                    Dynamic Dispatch List items         : [45678, value]
                    Dynamic Dispatch List items size    : 2
        */

    }
}