package J01_Java_Basic_Programs.Number_Programs;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int c;

        System.out.print("\nEnter First Number : ");
        int a = sc.nextInt();

        System.out.print("\nEnter Second Number : ");
        int b = sc.nextInt();

    /*
        for (int i = 1; i <=b ; i++) {
            a++;
        }

        System.out.println("\nSum of Two Number is : "+a);
    */

        if (a < 0 && b < 0) {
            c = a + b;
        } else if (a < 0 || b < 0) {
            c = a + b;
        } else {
            c = a + b;
        }

        System.out.println("\nSum of Two Number is : " + c);

    }
}