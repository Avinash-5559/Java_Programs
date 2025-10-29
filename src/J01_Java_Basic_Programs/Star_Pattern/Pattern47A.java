package J01_Java_Basic_Programs.Star_Pattern;

public class Pattern47A {
    public static void main(String[] args) {

        int row = 9;
        int str = 7;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                if (i == 0 || i == row - 1 || j == str / 2) {
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
    * * * * * * *
          *
          *
          *
          *
          *
          *
          *
    * * * * * * *
*/