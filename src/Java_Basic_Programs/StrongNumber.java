package Java_Basic_Programs;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Number : ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            num /= 10;
        }
        if (temp == sum) {
            System.out.println("\n"+temp + " : is a Strong Number.");
        } else {
            System.out.println("\n"+temp + " : is not a Strong Number.");
        }
    }
}