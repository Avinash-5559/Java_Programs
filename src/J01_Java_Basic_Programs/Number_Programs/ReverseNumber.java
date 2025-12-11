package J01_Java_Basic_Programs.Number_Programs;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        int out = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the Number : ");
        int num = sc.nextInt();

        while (num > 0) {

            int rem = num % 10;
            out = out * 10 + rem;
            num = num / 10;

        }

        System.out.println("\nReverse Number is : " + out);
    }
}