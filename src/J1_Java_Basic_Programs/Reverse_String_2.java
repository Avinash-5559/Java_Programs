package J1_Java_Basic_Programs;

import java.util.Scanner;

public class Reverse_String_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nInput the String : ");
        String input = sc.nextLine();

        String[] words = input.split(" ");

        System.out.print("\nOutput is : ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }
}

/* ------------------------------ OUTPUT ------------------------------

    Input the String : Azam Amir Reza

    Output is : Reza Amir Azam

*/