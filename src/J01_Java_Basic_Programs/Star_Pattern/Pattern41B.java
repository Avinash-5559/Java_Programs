package J01_Java_Basic_Programs.Star_Pattern;

import java.util.Scanner;

public class Pattern41B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = 1;

        while (r == 1) {

            System.out.print("\nEnter the Number of Rows : ");
            int row = sc.nextInt();

            System.out.print("\nEnter the Number of Symbol : ");
            int str = sc.nextInt();

            System.out.print("\nEnter the Symbol : ");
            String sym = sc.next();

            System.out.println();

            for (int i = 0; i < row; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < str; j++) {
                        System.out.print(sym + " ");
                    }
                } else {
                    for (int j = 0; j < str; j++) {
                        System.out.print(" " + sym);
                    }
                }
                System.out.println();
                if (i % 2 == 0) {
                    str--;
                } else {
                    str++;
                }
            }
            System.out.print("\nPress 1 to Continue OR Press Any Number to Exit : ");
            r = sc.nextInt();
        }
        if (r != 1) {
            System.out.println("\nThank You.");
        }
    }
}

/*
    * * * * * * * * * * *
     * * * * * * * * * *
    * * * * * * * * * * *
     * * * * * * * * * *
    * * * * * * * * * * *
     * * * * * * * * * *
    * * * * * * * * * * *
     * * * * * * * * * *
    * * * * * * * * * * *
     * * * * * * * * * *
    * * * * * * * * * * *
     * * * * * * * * * *
    * * * * * * * * * * *
     * * * * * * * * * *
    * * * * * * * * * * *
*/