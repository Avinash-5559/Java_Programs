package J01_Java_Basic_Programs;

public class Pattern17A {
    public static void main(String[] args) {

        int row = 6;
        int str = 6;
        int spc = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < str; j++) {
                if (i == 0 || j == 0 || j == (str - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            str--;
            spc++;
        }
    }
}

/*
    * * * * * *
      *       *
        *     *
          *   *
            * *
              *
*/