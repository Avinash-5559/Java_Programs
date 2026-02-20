package J01_Java_Basic_Programs.Array_Programs;

public class Array_LowestValue {
    public static void main(String[] args) {

        int[] arrayNumbers = {44, 23, 58, 88, 14, 96, 15, 76, 83, 99};

        int minimum = Integer.MAX_VALUE;            // int minimum = arrayNumbers[0];

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] < minimum) {
                minimum = arrayNumbers[i];
            }
        }

        System.out.println("\nLowest Values is : " + minimum);

    }
}