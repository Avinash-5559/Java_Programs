package J1_Java_Basic_Programs;

public class Pattern21A {
    public static void main(String[] args) {

        int row = 5;
        int str = 5;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                if (i == 0 || j == 0 || j == (str-1) || i == (row-1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/*
    * * * * *
    *       *
    *       *
    *       *
    * * * * *
*/