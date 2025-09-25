package J01_Java_Basic_Programs.Star_Pattern;

public class Pattern37A {
    public static void main(String[] args) {

        int row = 9;
        int spc = 0;
        int str = 5;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < str; j++) {
                if (i == 0 || j == 0 || j == str - 1 || i == row - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            if (i < row / 2) {
                spc++;
                str--;
            } else {
                spc--;
                str++;
            }
        }
    }
}

/*
    * * * * *
      *     *
        *   *
          * *
            *
          * *
        *   *
      *     *
    * * * * *
*/