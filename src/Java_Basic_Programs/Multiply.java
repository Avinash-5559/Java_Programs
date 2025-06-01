package Java_Basic_Programs;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {

        int temp = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter First Number : ");
        int a = sc.nextInt();

        System.out.print("\nEnter Second Number : ");
        int b = sc.nextInt();

        if ((a < 0) || (b < 0)) {
            System.out.println("\nInvalid Inputs. Please Enter Positive Numbers only.");
        }else {

            for (int i = b; i >= 1; i--) {
                temp += a;
            }

            System.out.println("\nMultiply of Two Number is : " + temp);
        }
    }
}