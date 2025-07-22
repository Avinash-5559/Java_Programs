package Java_Basic_Programs;

public class Pattern14A {
    public static void main(String[] args) {

        int row = 6;
        int str = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                if (j == 0 || j == i || i == (row - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            str++;
        }
    }
}

/*
    *
    * *
    *   *
    *     *
    *       *
    * * * * * *
*/