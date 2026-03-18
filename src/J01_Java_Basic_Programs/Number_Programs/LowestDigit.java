package J01_Java_Basic_Programs.Number_Programs;

import java.util.Scanner;

public class LowestDigit {
    public static void main(String[] args) {

        int minimum = Integer.MAX_VALUE;           // int minimum = 10;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Number : ");
        int number = sc.nextInt();
        int temp = number;

        while (number > 0) {
            int reminder = number % 10;
            if (reminder < minimum) {
                minimum = reminder;
            }
            number /= 10;
        }

        System.out.println("\nHighest Digit of this number " + temp + " is : " + minimum);
    }
}