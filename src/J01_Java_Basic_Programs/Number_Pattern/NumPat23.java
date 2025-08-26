package J01_Java_Basic_Programs.Number_Pattern;

public class NumPat23 {
    public static void main(String[] args) {
        int row = 9;
        int spc = 5;
        int str = 1;
        int num = 1;
        int temp = num;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < str; j++) {
                if (j == 0 || j == i || i == (row - 1) || j == (str - 1)) {
                    System.out.print(num + " ");
                } else {
                    System.out.print("  ");
                }
                num += 2;
            }
            System.out.println();
            if (i < row / 2) {
                str++;
                spc--;
                num = temp;
            } else {
                str--;
                spc++;
                num = temp;
            }
        }
    }
}

/*
         1
        1 3
       1   5
      1     7
     1       9
      1     7
       1   5
        1 3
         1
 */