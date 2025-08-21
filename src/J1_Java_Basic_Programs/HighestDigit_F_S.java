package J1_Java_Basic_Programs;

import java.util.Scanner;

public class HighestDigit_F_S {
    public static void main(String[] args) {

        int max = 0;
        int sec = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Number : ");
        int num = sc.nextInt();//46657
        int temp = num;

        while (num > 0) {
            int rem = num % 10;
            if (rem > max) {
                sec = max;
                max = rem;
            } else if ((rem > sec) && (rem != max)) {
                sec = rem;
            }
            num /= 10;
        }

        System.out.println("\nFirst Highest Digit of " + temp + " is : " + max);

        System.out.println("\nSecond Highest Digit of " + temp + " is : " + sec);
    }
}