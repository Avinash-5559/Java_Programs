package J01_Java_Basic_Programs.Number_Pattern;

public class NumPat29 {
    public static void main(String[] args) {

        int row = 9;

        for (int i = row; i > 0; i--) {
            for (int j = i; j < row; j++) {
                System.out.print(j + "  ");
            }
            for (int j = row - i; j < row; j++) {
                System.out.print(row + "  ");
            }
            System.out.println();
        }
    }
}

/*
    9  9  9  9  9  9  9  9  9
    8  9  9  9  9  9  9  9  9
    7  8  9  9  9  9  9  9  9
    6  7  8  9  9  9  9  9  9
    5  6  7  8  9  9  9  9  9
    4  5  6  7  8  9  9  9  9
    3  4  5  6  7  8  9  9  9
    2  3  4  5  6  7  8  9  9
    1  2  3  4  5  6  7  8  9
*/