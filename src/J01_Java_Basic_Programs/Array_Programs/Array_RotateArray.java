package J01_Java_Basic_Programs.Array_Programs;

import java.util.Arrays;

public class Array_RotateArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("\nCurrent Order of Array is : " + Arrays.toString(array));

        int k = 3;
        int n = array.length;

        k = k % n;

        int left, right, temp;

        // ==================== STEP 1: Reverse whole array ====================

        left = 0;
        right = n - 1;

        while (left < right) {
            temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        System.out.println("\nReverse Order of Array is : " + Arrays.toString(array));

        // ==================== STEP 2: Reverse first k elements ====================

        left = 0;
        right = k - 1;

        while (left < right) {
            temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        System.out.println("\nReverse k elements Array is : " + Arrays.toString(array));

        // ==================== STEP 3: Reverse remaining elements ====================

        left = k;
        right = n - 1;

        while (left < right) {
            temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        System.out.println("\nRotated Order of Array is : " + Arrays.toString(array));

    }
}