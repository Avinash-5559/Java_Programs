package J1_Java_Basic_Programs;

public class Pattern9A {
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
                str += 2;
                spc--;
            } else {
                str -= 2;
                spc++;
            }
            System.out.println();
        }
    }
}

/*
        *
      * * *
    * * * * *
      * * *
        *
*/