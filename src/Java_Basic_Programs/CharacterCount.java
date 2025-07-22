package Java_Basic_Programs;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nInput the Character : ");
        String input = sc.next();

        int[] freq = new int[26];

        for (char c : input.toCharArray()) {
            freq[c - 'a']++;
        }

        System.out.println("\n========== CHARACTER COUNTS ==========");
        System.out.println();

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a') + " occurs " + freq[i] + " time" + (freq[i] > 1 ? "s" : ""));
            }
        }
    }
}

/* ------------------------------ OUTPUT ------------------------------

    Input the Character : azam

    ========== CHARACTER COUNTS ==========

    a occurs 2 times
    m occurs 1 time
    z occurs 1 time

*/