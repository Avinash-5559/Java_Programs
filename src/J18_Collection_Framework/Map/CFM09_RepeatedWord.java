package J18_Collection_Framework.Map;

import java.util.HashMap;

public class CFM09_RepeatedWord {
    public static void main(String[] args) {

        String sentence = "apple banana apple orange banana apple";

        String[] words = sentence.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {

            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        String mostRepeated = "";
        int maxCount = 0;

        for (String key : map.keySet()) {

            if (map.get(key) > maxCount) {
                maxCount = map.get(key);
                mostRepeated = key;

            }
        }

        System.out.println("\nMost Repeated Word is : " + mostRepeated + " | " + "Count is : " + maxCount + " times");

    }
}