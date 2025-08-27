package J01_Java_Basic_Programs.Star_Pattern;

import java.util.Scanner;

public class Pattern22B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = 1;

        while ((r > 0) && (r <= 1)) {

            System.out.print("\nEnter the Number of Rows : ");
            int row = sc.nextInt();

            System.out.print("\nEnter the Number of Symbol (ODD NUMBERS ONLY) : ");
            int str = sc.nextInt();

            if (str % 2 == 0 || str < 0) {
                System.out.println("\n---------- PLEASE ENTER 'ODD NUMBERS WITH POSITIVE INTEGERS ONLY' for the Symbol ----------");
            } else {

                System.out.print("\nEnter the Symbol : ");
                String sym = sc.next();

                System.out.println();

                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < str; j++) {
                        if (i == str / 2 || j == str / 2) {
                            System.out.print(sym);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
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
     *
     *
  *******
     *
     *
     *
*/