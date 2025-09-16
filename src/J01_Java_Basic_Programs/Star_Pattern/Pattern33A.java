package J01_Java_Basic_Programs.Star_Pattern;

public class Pattern33A {
    public static void main(String[] args) {

        int row = 5;
        int str = 5;

        for (int i = row; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= 2 * (str - i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

/*
    * * * * * * * * * *
    * * * *     * * * *
    * * *         * * *
    * *             * *
    *                 *
*/