package J01_Java_Basic_Programs;

import java.util.Scanner;

public class LastThreeCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the String value : ");
        String s1 = sc.next();

        if (s1.length() >= 3) {
            String lastThree = s1.substring(s1.length() - 3);
            System.out.println("\nLast Three Characters of String : " + lastThree);
        } else {
            System.out.println("\nString is too short!");
        }
    }
}