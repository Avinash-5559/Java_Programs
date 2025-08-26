package J01_Java_Basic_Programs.Star_Pattern;

public class Pattern16A {
    public static void main(String[] args) {

        int row = 6;
        int str = 6;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                if (i == 0 || j == 0 || j == (str - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            str--;
        }
    }
}

/*
    * * * * * *
    *       *
    *     *
    *   *
    * *
    *
*/