package J01_Java_Basic_Programs;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {

        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Number : ");
        int num = sc.nextInt();

        while (num>0){
            count++;
            num/=10;
        }

        System.out.println("\nNumber of Digit is : "+count);
    }
}
