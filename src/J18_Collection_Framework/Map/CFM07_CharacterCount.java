package J18_Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class CFM07_CharacterCount {
    public static void main(String[] args) {

        String str = "programming";
        str = str.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println("\n========== CHARACTER COUNTS ==========\n");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " time" + (entry.getValue() > 1 ? "s" : ""));
        }

    }
}

/* ------------------------------ OUTPUT ------------------------------

    ========== CHARACTER COUNTS ==========

    p occurs 1 time
    a occurs 1 time
    r occurs 2 times
    g occurs 2 times
    i occurs 1 time
    m occurs 2 times
    n occurs 1 time
    o occurs 1 time

*/