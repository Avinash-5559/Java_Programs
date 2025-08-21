package J1_Java_Basic_Programs;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int out = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Number : ");
        int num = sc.nextInt();

        for (int i = num; i > 0; i--) {
            out *= i;
        }

        System.out.println("\nFactorial Number of "+num+" is "+out+".");
    }
}
