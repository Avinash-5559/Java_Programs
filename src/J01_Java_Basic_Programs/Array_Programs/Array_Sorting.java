package J01_Java_Basic_Programs.Array_Programs;

import java.util.Arrays;

public class Array_Sorting {
    public static void main(String[] args) {

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

        //------------------------------ FOR LOOP ------------------------------

        System.out.print("\nBefore Sort : " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("\nAfter Sort : " + Arrays.toString(numbers));

        //------------------------- FOR EACH LOOP -------------------------

        /*

        System.out.print("\nBefore Sort : ");

        for (int n1 : numbers) {
            System.out.print(n1 + " ");
        }

        Arrays.sort(numbers);

        System.out.println();
        System.out.print("\nAfter Sort : ");

        for (int n2 : numbers) {
            System.out.print(n2 + " ");
        }
        System.out.println();

        */

        //-------------------------------------- SHORTCUT --------------------------------------

        /*

        System.out.print("\nBefore Sorting the Elements : " + Arrays.toString(numbers));
        System.out.println();

        Arrays.sort(numbers);

        System.out.print("\nAfter Sorting the Elements : " + Arrays.toString(numbers));
        System.out.println();

        */

    }
}