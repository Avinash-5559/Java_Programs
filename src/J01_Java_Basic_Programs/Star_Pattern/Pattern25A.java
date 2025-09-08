package J01_Java_Basic_Programs.Star_Pattern;

public class Pattern25A {
    public static void main(String[] args) {

        int row = 10;
        int str = 10;

        for (int i = 0; i < row; i++) {
            for (int j = i; j < str; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < str; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 2 * (str - i - 1); j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
    * * * * * * * * * * * * * * * * * * * *
    * * * * * * * * *     * * * * * * * * *
    * * * * * * * *         * * * * * * * *
    * * * * * * *             * * * * * * *
    * * * * * *                 * * * * * *
    * * * * *                     * * * * *
    * * * *                         * * * *
    * * *                             * * *
    * *                                 * *
    *                                     *
    * *                                 * *
    * * *                             * * *
    * * * *                         * * * *
    * * * * *                     * * * * *
    * * * * * *                 * * * * * *
    * * * * * * *             * * * * * * *
    * * * * * * * *         * * * * * * * *
    * * * * * * * * *     * * * * * * * * *
    * * * * * * * * * * * * * * * * * * * *
*/