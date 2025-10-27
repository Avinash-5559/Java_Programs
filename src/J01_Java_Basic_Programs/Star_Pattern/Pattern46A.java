package J01_Java_Basic_Programs.Star_Pattern;

public class Pattern46A {
    public static void main(String[] args) {

        int row = 9;
        int str = 7;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                if (j == 0 || j == str - 1 || i == row / 2) {
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
    *           *
    *           *
    *           *
    *           *
    * * * * * * *
    *           *
    *           *
    *           *
    *           *
*/