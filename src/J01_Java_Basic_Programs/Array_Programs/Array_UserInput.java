package J01_Java_Basic_Programs.Array_Programs;

import java.util.Scanner;

public class Array_UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Size of the Array : ");
        int size = sc.nextInt();

        int[] num = new int[size];

        if (size == 0) {

            System.out.println("\n------There is no size of the ARRAY------");

        } else {

            for (int i = 0; i < size; i++) {
                System.out.print("\nEnter the Number : ");
                num[i] = sc.nextInt();

            }
            if (size == 1) {

                System.out.println("\n--------------NUMBER--------------");

            } else {

                System.out.println("\n-------------- NUMBERS --------------");
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}