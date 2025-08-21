package J1_Java_Basic_Programs;

import java.util.Scanner;

public class DuplicateCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nInput the Character : ");
        String input = sc.next();

        boolean found = false;

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    System.out.println("\nDuplicate Character is : " + input.charAt(i));
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        if (!found) {
            System.out.println("\nNo Duplicate Character Found.");
        }
    }

}

/* ------------------------------ OUTPUT ------------------------------

    Input the Character : azam

    Duplicate Character is : a
*/