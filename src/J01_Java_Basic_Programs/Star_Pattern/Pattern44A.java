package J01_Java_Basic_Programs.Star_Pattern;

public class Pattern44A {
    public static void main(String[] args) {

        int row = 6;
        int spc = 6;
        int str = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < str; j++) {
                if (j == 0 || j == i || i == (row / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            spc--;
            str++;
        }
    }
}

/*
         *
        * *
       *   *
      * * * *
     *       *
    *         *
*/