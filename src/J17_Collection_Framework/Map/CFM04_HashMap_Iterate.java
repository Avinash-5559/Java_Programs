package J17_Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class CFM04_HashMap_Iterate {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap();

        map.put("id", 1);
        map.put("id2", 2);
        map.put("id3", 34);
        map.put("id4", null);
        map.put("id5", null);
        map.put(null, 100);

        // This is the Advanced "For Each" Loop for the Map Interface

        for (Map.Entry<String, Integer> item : map.entrySet()) {
            System.out.println("Key : " + item.getKey() + ", Value : " + item.getValue());
        }

        /*
            OUTPUT :
                    Key : null, Value : 100
                    Key : id2, Value : 2
                    Key : id4, Value : null
                    Key : id3, Value : 34
                    Key : id, Value : 1
                    Key : id5, Value : null
        */

    }
}
