package J01_Java_Basic_Programs.Star_Pattern;

public class Pattern41A {
    public static void main(String[] args) {

        int row = 15;
        int str = 11;

        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < str; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j < str; j++) {
                    System.out.print(" *");
                }
            }
            System.out.println();
            if (i % 2 == 0) {
                str--;
            } else {
                str++;
            }
        }
    }
}

/*
    * * * * * * * * * * *
     * * * * * * * * * *
    * * * * * * * * * * *
     * * * * * * * * * *
    * * * * * * * * * * *
     * * * * * * * * * *
    * * * * * * * * * * *
     * * * * * * * * * *
    * * * * * * * * * * *
     * * * * * * * * * *
    * * * * * * * * * * *
     * * * * * * * * * *
    * * * * * * * * * * *
     * * * * * * * * * *
    * * * * * * * * * * *
*/