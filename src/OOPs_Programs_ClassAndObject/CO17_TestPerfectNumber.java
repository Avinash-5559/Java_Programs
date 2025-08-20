package OOPs_Programs_ClassAndObject;

import java.util.Scanner;

public class CO17_TestPerfectNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CO17_PerfectNumber per = new CO17_PerfectNumber();

        System.out.print("\nEnter the Number : ");
        per.num = sc.nextInt();

        per.findPerfectNumber();
    }
}
