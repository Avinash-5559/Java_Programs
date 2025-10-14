package J01_Java_Basic_Programs.Star_Pattern;

public class Pattern42A {
    public static void main(String[] args) {

        int row = 10;
        int str = 8;

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
        }
    }
}

/*
    * * * * * * * *
     * * * * * * * *
    * * * * * * * *
     * * * * * * * *
    * * * * * * * *
     * * * * * * * *
    * * * * * * * *
     * * * * * * * *
    * * * * * * * *
     * * * * * * * *
*/