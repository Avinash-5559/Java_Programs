package J17_Collection_Framework.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CFM01_All_Map_Classes {
    public static void main(String[] args) {

        System.out.println("\n--------------------------------- HashMap ---------------------------------\n");

        Map m1 = new HashMap();

        // name, rollNo, phone are the "Keys"
        // pramod, 1, 987654321 are the "Values"

        m1.put("name", "pramod");
        m1.put("rollNo", 1);
        m1.put("phone", 987654321);

        System.out.println("HashMap : " + m1);

        /*
            OUTPUT :
                    --------------------------------- HashMap ---------------------------------

                    HashMap : {phone=987654321, name=pramod, rollNo=1}
        */

        System.out.println("\n------------------------------ LinkedHashMap ------------------------------\n");


        Map m2 = new LinkedHashMap();

        // name, rollNo, phone are the "Keys"
        // pramod, 1, 987654321 are the "Values"

        m2.put("name", "pramod");
        m2.put("rollNo", 1);
        m2.put("phone", 987654321);

        System.out.println("LinkedHashMap  : " + m2);

        /*
            OUTPUT :
                    ------------------------------ LinkedHashMap ------------------------------

                    LinkedHashMap  : {name=pramod, rollNo=1, phone=987654321}
        */

        System.out.println("\n--------------------------------- TreeMap ---------------------------------\n");

        Map m3 = new TreeMap();

        // name, rollNo, phone are the "Keys"
        // pramod, 1, 987654321 are the "Values"

        m3.put("name", "pramod");
        m3.put("rollNo", 1);
        m3.put("phone", 987654321);

        System.out.println("TreeMap : " + m3);

        /*
            OUTPUT :
                    --------------------------------- TreeMap ---------------------------------

                    TreeMap : {name=pramod, phone=987654321, rollNo=1}
        */

    }
}