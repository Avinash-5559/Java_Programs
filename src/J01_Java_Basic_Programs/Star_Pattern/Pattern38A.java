package J01_Java_Basic_Programs.Star_Pattern;

public class Pattern38A {
    public static void main(String[] args) {

        int row = 12;
        int spc = 12;
        int str = 12;

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
            spc--;
        }
    }
}

/*
               * * * * * * * * * * * *
              *                     *
             *                     *
            *                     *
           *                     *
          *                     *
         *                     *
        *                     *
       *                     *
      *                     *
     *                     *
    * * * * * * * * * * * *
*/