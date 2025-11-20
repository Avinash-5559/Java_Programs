package J17_Collection_Framework.Set;

import java.util.HashSet;

public class CFS02_HashSet {
    public static void main(String[] args) {

        HashSet set = new HashSet();

        set.add("Orange");
        set.add("Apple");
        set.add("Mango");
        set.add(null);
        set.add(953656);
        set.add("WaterMelon");
        set.add("Apple");

        System.out.println("HashSet List Items : " + set);

        /*
          OUTPUT :
                    HashSet List Items : [null, Apple, 953656, Mango, WaterMelon, Orange]
        */
    }
}