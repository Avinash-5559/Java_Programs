package J01_Java_Basic_Programs.Star_Pattern;

public class Pattern30A {
    public static void main(String[] args) {

        int row = 11;
        int spc = 0;
        int str = 6;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < str; j++) {
                System.out.print("* ");
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
    * * * * * *
      * * * * *
        * * * *
          * * *
            * *
              *
            * *
          * * *
        * * * *
      * * * * *
    * * * * * *
*/