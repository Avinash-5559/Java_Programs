package J01_Java_Basic_Programs.Array_Programs;

import java.util.Arrays;

public class Array_NumberReverse_1 {

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("\nCurrent Order of Array is : " + Arrays.toString(array));

        int left = 0;
        int right = array.length - 1;
        int temp;

        //=========================================== TWO POINTER APPROACH ===========================================

        while (left < right) {
            temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        System.out.println("\nReverse Order of Array is : " + Arrays.toString(array));
    }
}