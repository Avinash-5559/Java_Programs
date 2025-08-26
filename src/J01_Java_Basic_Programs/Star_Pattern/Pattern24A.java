package J01_Java_Basic_Programs.Star_Pattern;

public class Pattern24A {
    public static void main(String[] args) {

        int row = 6;
        int str = 6;

        for (int i = 0; i < 2 * row - 1; i++) {
            for (int j = 0; j < 2 * str - 1; j++) {
                if (i == 0 || j == i || j == 2 * str - 2 - i || i == (2 * row - 2)) {
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
  ***********
   *       *
    *     *
     *   *
      * *
       *
      * *
     *   *
    *     *
   *       *
  ***********
*/