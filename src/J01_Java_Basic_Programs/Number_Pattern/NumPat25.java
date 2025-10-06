package J01_Java_Basic_Programs.Number_Pattern;

public class NumPat25 {
    public static void main(String[] args) {

        int row = 7;
        int str = 9;
        int num0 = 0;
        int num1 = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                if (j % 2 == 0) {
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
    1 0 1 0 1 0 1 0 1
    1 0 1 0 1 0 1 0 1
    1 0 1 0 1 0 1 0 1
    1 0 1 0 1 0 1 0 1
    1 0 1 0 1 0 1 0 1
    1 0 1 0 1 0 1 0 1
    1 0 1 0 1 0 1 0 1
*/