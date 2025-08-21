package J1_Java_Basic_Programs;

import java.util.Scanner;

public class LowestDigit_F_S {
    public static void main(String[] args) {

        int min = 10;
        int sec = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Number : ");
        int num = sc.nextInt();
        int temp = num;

        while (num > 0) {
            int rem = num % 10;
            if (rem < min) {
                sec = min;
                min = rem;
            } else if ((rem < sec) && (rem != min)) {
                sec = rem;
            }
            num /= 10;
        }

        System.out.println("\nFirst Lowest Digit of " + temp + " is : " + min);

        System.out.println("\nSecond Lowest Digit of " + temp + " is : " + sec);
    }
}