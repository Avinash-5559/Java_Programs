package J01_Java_Basic_Programs.Array_Programs;

import java.util.Arrays;

public class Array_AddNumber_2 {
    public static void main(String[] args) {

        int[] originalArray = {10, 20, 30, 40};
        int numberToAdd = 50;

        System.out.println("\nOriginal Array : " + Arrays.toString(originalArray));

        // 1. Create a new array with a size one greater than the original
        int[] newArray = new int[originalArray.length + 1];

        // 2. Copy elements from the old array to the new array
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        // 3. Add the new number to the last position of the new array
        newArray[newArray.length - 1] = numberToAdd;

        // 4. (Optional) Reassign the original array variable to the new array
        originalArray = newArray;

        System.out.println("\nUpdated Array : " + Arrays.toString(originalArray));

    }
}