package J01_Java_Basic_Programs.Star_Pattern;

public class Pattern31A {
    public static void main(String[] args) {

        int row = 9;
        int spc = 0;
        int str = 9;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < str; j++) {
                System.out.print("* ");
            }
            if (i < row / 2) {
                spc++;
                str -= 2;
            } else {
                spc--;
                str += 2;
            }
            System.out.println();
        }
    }
}

/*
    * * * * * * * * *
      * * * * * * *
        * * * * *
          * * *
            *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *
*/