package J01_Java_Basic_Programs.Array_Programs;

public class Array_HighestValue {
    public static void main(String[] args) {

        int[] arrayNumbers = {44, 23, 58, 88, 69, 96, 45, 76, 83, 99};

        int maximum = Integer.MIN_VALUE;            // int maximum = arrayNumbers[0];

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] > maximum) {
                maximum = arrayNumbers[i];
            }
        }

        System.out.println("\nHighest Value is : " + maximum);

    }
}