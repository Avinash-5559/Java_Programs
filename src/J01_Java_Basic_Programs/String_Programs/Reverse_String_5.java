package J01_Java_Basic_Programs.String_Programs;

import java.util.Arrays;

public class Reverse_String_5 {
    public static void main(String[] args) {

        String[] input = {"Avinash", "is", "in", "the", "interview"};

        System.out.println("\nCurrent Order of the String is : " + Arrays.toString(input));

        //=========================================== TWO POINTER APPROACH ===========================================

        int left = 1;
        int right = input.length - 2;
        String temp;

        while (left < right) {

            temp = input[left];
            input[left] = input[right];
            input[right] = temp;
            left++;
            right--;

        }

        System.out.println("\nReverse Order of the String is : " + Arrays.toString(input));

    }
}

/*

    ------------------------------ OUTPUT ------------------------------

    Current Order of the String is : [Avinash, is, in, the, interview]

    Reverse Order of the String is : [Avinash, the, in, is, interview]

*/