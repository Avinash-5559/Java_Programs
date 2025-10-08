package J01_Java_Basic_Programs.Number_Pattern;

public class NumPat28 {
    public static void main(String[] args) {

        int row = 9;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(0 + "  ");
            }
            System.out.print(i + "  ");
            for (int j = i; j < row; j++) {
                System.out.print(0 + "  ");
            }
            System.out.println();
        }
    }
}

/*
    1  0  0  0  0  0  0  0  0
    0  2  0  0  0  0  0  0  0
    0  0  3  0  0  0  0  0  0
    0  0  0  4  0  0  0  0  0
    0  0  0  0  5  0  0  0  0
    0  0  0  0  0  6  0  0  0
    0  0  0  0  0  0  7  0  0
    0  0  0  0  0  0  0  8  0
    0  0  0  0  0  0  0  0  9
*/