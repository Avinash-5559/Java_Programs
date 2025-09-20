package J01_Java_Basic_Programs.Star_Pattern;

public class Pattern35A {
    public static void main(String[] args) {


        int row = 11;
        int spc = 5;
        int str = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < str; j++) {
                if (j == 0 || j == str - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            if (i < row / 2) {
                spc--;
                str++;
            } else {
                spc++;
                str--;
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
      *       *
        *     *
          *   *
            * *
              *
*/