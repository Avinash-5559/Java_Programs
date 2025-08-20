package OOPs_Programs_ClassAndObject;

import java.util.Scanner;

public class CO15_TestPalindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        CO15_Palindrome pal = new CO15_Palindrome();

        System.out.print("\nEnter the Number : ");
        pal.num=sc.nextInt();

        pal.findPalindrome();
    }
}