package J01_Java_Basic_Programs;

public class Pattern12A {
    public static void main(String[] args) {

        int row = 11;
        int str = 1;
        int spc = 5;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < str; j++) {
                System.out.print("* ");
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
       * * *
      * * * *
     * * * * *
    * * * * * *
     * * * * *
      * * * *
       * * *
        * *
         *
*/