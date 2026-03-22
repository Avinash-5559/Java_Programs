package J01_Java_Basic_Programs.Array_Programs;

import java.util.HashSet;
import java.util.Set;

public class Array_Duplicate {
    public static void main(String[] args) {

        int[] input = {10, 30, 30, 50, 80, 40, 60, 10, 90, 75};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int number : input) {
            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }
        System.out.println("\nDuplicates Elements : " + duplicates);
    }
}