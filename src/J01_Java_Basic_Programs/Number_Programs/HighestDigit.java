package J01_Java_Basic_Programs.Number_Programs;

import java.util.Scanner;

public class HighestDigit {
    public static void main(String[] args) {

        int maximum = Integer.MIN_VALUE;            // int maximum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Number : ");
        int number = sc.nextInt();
        int temp = number;

        while (number > 0) {
            int reminder = number % 10;
            if (reminder > maximum) {
                maximum = reminder;
            }
            number /= 10;
        }
        System.out.println("\nHighest Digit of this number " + temp + " is : " + maximum);
    }
}