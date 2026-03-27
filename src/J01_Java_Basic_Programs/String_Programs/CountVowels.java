package J01_Java_Basic_Programs.String_Programs;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a string : ");
        String str = sc.nextLine();

        int count = 0;

        // Convert string to lowercase to handle both cases
        str = str.toLowerCase();

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }

        }

        System.out.print("\nNumber of vowels : " + count + "\n");

    }
}