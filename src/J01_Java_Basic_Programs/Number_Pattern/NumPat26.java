package J01_Java_Basic_Programs.Number_Pattern;

public class NumPat26 {
    public static void main(String[] args) {

        int row = 9;
        int str = 16;
        int num0 = 0;
        int num1 = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                if (i == 0 || j == 0 || j == str - 1 || i == row - 1) {
                    System.out.print(num1 + " ");
                } else {
                    System.out.print(num0 + " ");
                }
            }
            System.out.println();
        }
    }
}

/*
    1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
    1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
    1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
    1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
    1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
    1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
    1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
    1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
    1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
*/