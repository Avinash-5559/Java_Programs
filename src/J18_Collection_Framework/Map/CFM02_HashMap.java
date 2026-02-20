package J18_Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class CFM02_HashMap {
    public static void main(String[] args) {

        Map map = new HashMap();

        map.put("id", 1);
        map.put("id", 2);
        map.put("id2", 2);
        map.put("id3", 34);
        map.put("id4", 34);
        map.put("id5", null);
        map.put("id6", null);
        map.put(null, 102);
        map.put("id7", 501);

        System.out.println("HashMap List                    : " + map);
        System.out.println("HashMap Size                    : " + map.size());
        System.out.println("Does HashMap is Empty           : " + map.isEmpty());
        System.out.println("HashMap contains this Key       : " + map.containsKey("id2"));
        System.out.println("HashMap contains this Value     : " + map.containsValue(99));
        System.out.println("All HashMap Keys                : " + map.keySet());
        System.out.println("All HashMap Values              : " + map.values());
        System.out.println("Get Value of this Key           : " + map.get("id3"));

        /*
          OUTPUT :
                  HashMap List                    : {null=102, id2=2, id4=34, id3=34, id6=null, id=2, id5=null, id7=501}
                  HashMap Size                    : 8
                  Does HashMap is Empty           : false
                  HashMap contains this Key       : true
                  HashMap contains this Value     : false
                  All HashMap Keys                : [null, id2, id4, id3, id6, id, id5, id7]
                  All HashMap Values              : [102, 2, 34, 34, null, 2, null, 501]
                  Get Value of this Key           : 34
        */

    }
}