package J01_Java_Basic_Programs;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int out = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Number : ");
        int num = sc.nextInt();
        int num1 = num;
        int val = num;

        while (num > 0) {
            count++;
            num /= 10;
        }

        if (count == 3) {

            while (num1 > 0) {
                int rem = num1 % 10;
                int temp = rem * rem * rem;
                out += temp;
                num1 /= 10;
            }
        } else {

            while (num1 > 0) {
                int rem = num1 % 10;
                int temp = rem * rem * rem * rem;
                out += temp;
                num1 /= 10;
            }
        }

        if (val == out) {
            System.out.println("\n" + val + " : is a Armstrong Number");
        } else {
            System.out.println("\n" + val + " : is not a Armstrong Number");
        }
    }
}