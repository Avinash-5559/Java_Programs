package J1_Java_Basic_Programs;

public class Pattern4A {
    public static void main(String[] args) {

        int row = 3;
        int str = 3;
        int spc = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < str; j++) {
                System.out.print("* ");
            }
            System.out.println();
            str--;
            spc++;
        }
    }
}

/*
    * * *
      * *
        *
*/