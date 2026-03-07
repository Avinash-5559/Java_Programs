package J01_Java_Basic_Programs.Array_Programs;

import java.util.Arrays;

public class Array_RemoveNumber_1 {
    public static void main(String[] args) {

        int[] originalArray = {10, 20, 30, 40, 50};
        int indexToRemove = 2;

        System.out.println("\nOriginal Array : " + Arrays.toString(originalArray));

        int[] newArray = new int[originalArray.length - 1];

        for (int i = 0, j = 0; i < originalArray.length; i++) {
            if (i != indexToRemove) {
                newArray[j++] = originalArray[i];
            }

        }

        System.out.println("\nUpdated Array : " + Arrays.toString(newArray));

    }
}