package J18_Collection_Framework.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CFM03_HashMap_Vs_HashSet {
    public static void main(String[] args) {

        System.out.println("\n--------------------------------- HashMap ---------------------------------\n");

        Map<String, Object> student1 = new HashMap();

        student1.put("name", "Dipankar");
        student1.put("phone", "9876543210");
        student1.put("address", "Bangalore");
        student1.put("address", 123);

        System.out.println("HashMap Items : " + student1);

        /*
            OUTPUT :
                    --------------------------------- HashMap ---------------------------------

                    HashMap Items : {address=123, phone=9876543210, name=Dipankar}
        */

        System.out.println("\n--------------------------------- HashSet ---------------------------------\n");

        Set book_read_items = new HashSet();

        book_read_items.add("Rich dad Poor Dad");
        book_read_items.add("Sapiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the Frog");

        System.out.println("HashSet Items : " + book_read_items);

        /*
            OUTPUT :
                    --------------------------------- HashSet ---------------------------------

                    HashSet Items : [Secret, Sapiens, Atomic Habit, Eat the Frog, Rich dad Poor Dad]
        */

    }
}