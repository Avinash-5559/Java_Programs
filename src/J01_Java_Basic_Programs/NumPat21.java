package J01_Java_Basic_Programs;

public class NumPat21 {
    public static void main(String[] args) {

        int row = 5;
        int str = 5;
        int num = 1;

        for (int i = 0; i < 2 * row - 1; i++) {
            for (int j = 0; j < 2 * str - 1; j++) {
                if (j == i || j == 2 * str - 2 - i) {
                    System.out.print(num);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            num++;
        }
    }
}

/*
    1       1
     2     2
      3   3
       4 4
        5
       6 6
      7   7
     8     8
    9       9
*/