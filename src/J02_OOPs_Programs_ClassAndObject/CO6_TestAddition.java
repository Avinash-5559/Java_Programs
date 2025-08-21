package J02_OOPs_Programs_ClassAndObject;

import java.util.Scanner;

public class CO6_TestAddition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CO6_Addition add = new CO6_Addition();

        System.out.print("\nEnter First Number : ");
        add.a = sc.nextInt();

        System.out.print("\nEnter Second Number : ");
        add.b = sc.nextInt();

        System.out.println("\nSum of Two Number is : " + add.sum());
    }
}