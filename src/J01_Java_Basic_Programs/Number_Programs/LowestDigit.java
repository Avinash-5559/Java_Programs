package J01_Java_Basic_Programs.Number_Programs;

import java.util.Scanner;

public class LowestDigit {
    public static void main(String[] args) {

        int min = 10;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Number : ");
        int num = sc.nextInt();
        int j = num;

        while (num > 0) {
            int rem = num % 10;
            if (rem < min) {
                min = rem;
            }
            num /= 10;
        }

        System.out.println("\nHighest Digit of this number " + j + " is : " + min);
    }
}