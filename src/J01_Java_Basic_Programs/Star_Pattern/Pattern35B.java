package J01_Java_Basic_Programs.Star_Pattern;

import java.util.Scanner;

public class Pattern35B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = 1;

        while (r == 1) {

            System.out.print("\nEnter the Number of Rows (ODD NUMBERS ONLY) : ");
            int row = sc.nextInt();

            if (row % 2 == 0 || row < 0) {
                System.out.println("\n---------- PLEASE ENTER 'ODD NUMBERS WITH POSITIVE INTEGERS ONLY' for the Rows ----------");
            } else {
                System.out.print("\nEnter the Number of Spaces : ");
                int spc = sc.nextInt();

                System.out.print("\nEnter the Number of Symbol : ");
                int str = sc.nextInt();

                System.out.print("\nEnter the Symbol : ");
                String sym = sc.next();

                System.out.println();

                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < spc; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 0; j < str; j++) {
                        if (j == 0 || j == str - 1) {
                            System.out.print(sym + " ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                    if (i < row / 2) {
                        spc--;
                        str++;
                    } else {
                        spc++;
                        str--;
                    }
                }
                System.out.print("\nPress 1 to Continue OR Press Any Number to Exit : ");
                r = sc.nextInt();
            }
        }
        if (r != 1) {
            System.out.println("\nThank You.");
        }
    }
}

/*
              *
            * *
          *   *
        *     *
      *       *
    *         *
      *       *
        *     *
          *   *
            * *
              *
*/