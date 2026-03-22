package J20_Java_Streams;

import java.util.Arrays;

public class JS01_Sorting {
    public static void main(String[] args) {

        int[] numbers = {25, 6, 62, 95, 93, 15, 75, 31, 68, 45, 36, 8, 33, 46, 50, 56};

        System.out.println("\nBEFORE SORTING : " + Arrays.toString(numbers));


        //------------------------------ REGULAR ASCENDING ORDER SORTING ------------------------------

        /*

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("\nREGULAR ASCENDING ORDER SORTING : " + Arrays.toString(numbers));

        */

        //------------------------------ REGULAR DESCENDING ORDER SORTING ------------------------------

        /*

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("\nREGULAR DESCENDING ORDER SORTING : " + Arrays.toString(numbers));


        */

        //------------------------------ STREAM ASCENDING ORDER SORTING ------------------------------


        int[] ascendingSorted = Arrays.stream(numbers)
                .sorted()
                .toArray();

        System.out.println("\nSTREAM ASCENDING ORDER SORTING : " + Arrays.toString(ascendingSorted));

        //------------------------------ STREAM DESCENDING ORDER SORTING ------------------------------


        int[] descendingSorted = Arrays.stream(numbers)
                .boxed()
                .sorted((a, b) -> b - a)
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println("\nSTREAM DESCENDING ORDER SORTING : " + Arrays.toString(descendingSorted));

    }
}