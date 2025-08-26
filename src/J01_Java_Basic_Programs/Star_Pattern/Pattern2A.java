package J01_Java_Basic_Programs.Star_Pattern;

public class Pattern2A {
    public static void main(String[] args) {

        int row = 3;
        int str = 3;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print("* ");
            }
            System.out.println();
            str--;
        }
    }
}

/*
    * * *
    * *
    *
*/