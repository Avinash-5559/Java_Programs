package J01_Java_Basic_Programs.Star_Pattern;

public class Pattern22A {
    public static void main(String[] args) {

        int row = 7;
        int str = 7;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                if (i == str / 2 || j == str / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*
     *
     *
     *
  *******
     *
     *
     *
*/