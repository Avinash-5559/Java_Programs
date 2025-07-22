package Java_Basic_Programs;

import java.util.Scanner;

public class Pattern13B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = 1;

        while ((r > 0) && (r <= 1)) {

            System.out.print("\nEnter Number of Rows : ");
            int row = sc.nextInt();

            System.out.print("\nEnter Number of Symbol : ");
            int str = sc.nextInt();

            System.out.print("\nEnter the Symbol : ");
            String sym = sc.next();

            System.out.println();

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < str; j++) {
                    System.out.print("*");
                }
                System.out.print(" ");
                for (int j = 0; j < str; j++) {
                    System.out.print("*");
                }
                System.out.println();
                str++;
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
    * *
    ** **
    *** ***
    **** ****
    ***** *****
    ****** ******
    ******* *******
    ******** ********
    ********* *********
    ********** **********
    *********** ***********
    ************ ************
*/