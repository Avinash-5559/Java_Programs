package J02_OOPs_Programs_ClassAndObject;

import java.util.Scanner;

public class CO16_TestStrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CO16_StrongNumber str = new CO16_StrongNumber();

        System.out.print("\nEnter the Number : ");
        str.num = sc.nextInt();

        str.findStrongNumber();
    }
}