package J01_Java_Basic_Programs.Array_Programs;

        /*
            2 9 3

            5 7 4

            1 6 4
        */

public class MaximumNumber {
    public static void main(String[] args) {

        int[][] matrix = {{2, 9, 3}, {5, 7, 4}, {1, 6, 4}};

        int max = matrix[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }

            }
        }
        System.out.println("\nMaximum Number in the Matrix is : " + max);
    }
}