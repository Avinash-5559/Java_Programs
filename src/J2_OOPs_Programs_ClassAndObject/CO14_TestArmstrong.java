package J2_OOPs_Programs_ClassAndObject;

import java.util.Scanner;

public class CO14_TestArmstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CO14_Armstrong arm = new CO14_Armstrong();

        System.out.print("\nEnter the number : ");
        arm.num = sc.nextInt();

        arm.findArmstrong();

    }
}