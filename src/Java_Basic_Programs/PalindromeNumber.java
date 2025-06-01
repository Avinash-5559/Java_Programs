package Java_Basic_Programs;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        int out = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the Number : ");
        int num = sc.nextInt();
        int val = num;

        while (num>0){

            int rem = num%10;
            out = out*10 + rem;
            num = num/10;

        }

        if (val == out){
            System.out.println("\n"+val+" : is a Palindrome Number");
        }else {
            System.out.println("\n"+val+" : is not a Palindrome Number");
        }

    }
}
