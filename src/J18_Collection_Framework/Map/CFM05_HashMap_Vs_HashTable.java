package J18_Collection_Framework.Map;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class CFM05_HashMap_Vs_HashTable {
    public static void main(String[] args) {

        System.out.println("\n--------------------------------- HashMap ---------------------------------\n");

        // HashMap contains Key, Value and "null" values also allow

        HashMap<Integer, String> ht1 = new HashMap<>();

        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
        ht1.put(3, null);
        ht1.put(null, null);

        System.out.println("HashMap Items : " + ht1);

        /*
            OUTPUT :
                    --------------------------------- HashMap ---------------------------------

                    HashMap Items : {null=null, 1=one, 2=two, 3=null}
        */

        System.out.println("\n-------------------------------- HashTable --------------------------------\n");

        // HashTable is a Legacy Class
        // HashTable contains Key, Value but "null" values does not allow
        // HashTable having Thread Safe means Synchronized i.e. run one by one but Slow in nature

        Hashtable<Integer, String> ht2 = new Hashtable();

        ht2.put(1, "one");
        ht2.put(2, "two");
        ht2.put(3, "three");
        // ht2.put(4, null);                // java.lang.NullPointerException
        // ht2.put(null, "three");          // java.lang.NullPointerException

        System.out.println("HashTable Items : " + ht2);

        System.out.println("\n-------------------- HashTable ENUMERATION --------------------");

        Enumeration<Integer> e = ht2.keys();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        /*
            OUTPUT :
                    -------------------------------- HashTable --------------------------------

                    HashTable Items : {3=three, 2=two, 1=one}

                    -------------------- HashTable ENUMERATION --------------------
                    3
                    2
                    1
        */

    }
}