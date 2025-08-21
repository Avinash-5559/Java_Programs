package J01_Java_Basic_Programs;

public class Pattern8A {
    public static void main(String[] args) {

        int row = 5;
        int str = 1;
        int spc = 2;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < str; j++) {
                System.out.print("* ");
            }
            if (i < row / 2) {
                str++;
                spc--;
            } else {
                str--;
                spc++;
            }
            System.out.println();
        }
    }
}

/*
        *
      * *
    * * *
      * *
        *
*/