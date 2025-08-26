package J01_Java_Basic_Programs.String_Programs;

import java.util.Scanner;

public class FirstThreeCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the String Value : ");
        String s1 = sc.next();

        if (s1.length() >= 3) {
            String firstThree = s1.substring(0, 3);
            System.out.println("\nFirst Three Characters of String : " + firstThree);
        } else {
            System.out.println("\nString is too short!");
        }
    }
}