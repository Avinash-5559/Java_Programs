package J15_Exceptions;

import java.util.Scanner;

public class EC09_Checked_TryCatchFinally2 {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);

        System.out.print("\nEnter the Number : ");
        int v = sc.nextInt();

        try {
           int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("Closing the Scanner Class");
        }
    }
}