package J18_Collection_Framework.Map;

import java.util.HashMap;

public class CFM08_WordCount {
    public static void main(String[] args) {

        String sentence = "apple banana orange banana apple";

        String[] words = sentence.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {

            if (map.containsKey(word)) {
                // word already exists → increase count by 1
                map.put(word, map.get(word) + 1);
            } else {
                // word seen for first time → set count to 1
                map.put(word, 1);
            }

        }

        // Print each word and its count
        System.out.println("\n=========== WORD COUNT ==========\n");
        for (String key : map.keySet()) {

            System.out.println(key + " comes " + map.get(key) + " time" + (map.get(key) > 1 ? "s" : ""));

        }
    }
}