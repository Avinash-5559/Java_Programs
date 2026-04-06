package J01_Java_Basic_Programs.Array_Programs;

        /*
            2 9 3

            5 7 4

            1 6 4
        */

public class MaximumColumnNumber {
    public static void main(String[] args) {

        int[][] matrix = {{2, 9, 3}, {5, 7, 4}, {1, 6, 4}};

        int max = matrix[0][0];
        int mincolumn = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    mincolumn = j;
                }

            }
        }

        int min = matrix[0][mincolumn];
        int k = 0;

        while (k < 3) {

            if (matrix[k][mincolumn] < min) {
                min = matrix[k][mincolumn];
            }

            k++;
        }

        System.out.println("\nMaximum Number in the Matrix is : " + max);

        System.out.println("\nMinimum Number of that maximum number column is : " + min);

    }
}