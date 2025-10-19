package J01_Java_Basic_Programs.Star_Pattern;

public class Pattern45A {
    public static void main(String[] args) {

        int row = 9;
        int str = 7;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                if (i == 0 || j == 0 || i == row - 1) {
                    System.out.print("* ");
                } else if ((i == row / 2) && (j == 1)) {
                    for (int k = 0; k < str / 2; k++) {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/*
    * * * * * * *
    *
    *
    *
    * * * *
    *
    *
    *
    * * * * * * *
*/