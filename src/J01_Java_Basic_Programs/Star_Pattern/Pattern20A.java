package J01_Java_Basic_Programs.Star_Pattern;

public class Pattern20A {
    public static void main(String[] args) {

        int row = 25;
        int spc = 24;
        int str = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < str; j++) {
                if (j == 0 || j == i || i == (row - 1) || j == (str - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            if (i < row / 2) {
                str++;
                spc--;
            } else {
                str--;
                spc++;
            }
        }
    }
}

/*
                 *
                * *
               *   *
              *     *
             *       *
            *         *
           *           *
          *             *
         *               *
        *                 *
       *                   *
      *                     *
     *                       *
      *                     *
       *                   *
        *                 *
         *               *
          *             *
           *           *
            *         *
             *       *
              *     *
               *   *
                * *
                 *
*/