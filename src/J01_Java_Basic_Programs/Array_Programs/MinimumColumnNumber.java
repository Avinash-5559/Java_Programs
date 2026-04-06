package J01_Java_Basic_Programs.Array_Programs;

        /*
            2 9 3

            5 7 4

            1 6 4
        */

public class MinimumColumnNumber {
    public static void main(String[] args) {

        int[][] matrix = {{2, 9, 3}, {5, 7, 4}, {1, 6, 4}};

        int min = matrix[0][0];
        int maxcolumn = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    maxcolumn = j;
                }

            }
        }

        int max = matrix[0][maxcolumn];
        int k = 0;

        while (k < 3) {

            if (matrix[k][maxcolumn] > max) {
                max = matrix[k][maxcolumn];
            }

            k++;
        }


        System.out.println("\nMinimum Number in the Matrix is : " + min);

        System.out.println("\nMaximum Number of that minimum number column is : " + max);
    }
}