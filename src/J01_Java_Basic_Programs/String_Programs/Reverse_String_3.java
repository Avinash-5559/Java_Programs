package J01_Java_Basic_Programs.String_Programs;

import java.util.Scanner;

public class Reverse_String_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nInput the String : ");
        String input = sc.nextLine();

        String[] words = input.split(" ");

        System.out.print("\nOutput is : ");

        for (String word : words) {
            String revWord = new StringBuilder(word).reverse().toString();
            System.out.print(revWord + " ");
        }
        System.out.println();
    }
}

/* ------------------------------ OUTPUT ------------------------------

    Input the String : Azam Amir Reza

    Output is : mazA rimA azeR

*/