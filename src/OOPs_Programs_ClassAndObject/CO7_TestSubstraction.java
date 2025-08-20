package OOPs_Programs_ClassAndObject;

import java.util.Scanner;

public class CO7_TestSubstraction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CO7_Substraction sub = new CO7_Substraction();

        System.out.print("\nEnter First Number : ");
        sub.a = sc.nextInt();

        System.out.print("\nEnter Second Number : ");
        sub.b = sc.nextInt();

        System.out.println("\nSubtract of Two Number is : " + sub.subtract());
    }
}