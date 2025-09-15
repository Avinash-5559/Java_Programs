package J01_Java_Basic_Programs.Star_Pattern;

public class Pattern32A {
    public static void main(String[] args) {

        int row = 5;
        int str = 5;

        for (int i = 1; i <= row; i++) {

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
    *                 *
    * *             * *
    * * *         * * *
    * * * *     * * * *
    * * * * * * * * * *
*/