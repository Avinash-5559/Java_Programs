/*
    Class:  A class is a blueprint or template used for creating objects.
            It defines the structure, including the variables (attributes) and methods (behaviors).
    Object: An object is the real-world entity which is created from that blueprint using the new keyword.
            It has actual values and can perform actions.
                                                      OR
            An object which are accesses and the uses of instance variables and methods
            which are defined by its class.
*/

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