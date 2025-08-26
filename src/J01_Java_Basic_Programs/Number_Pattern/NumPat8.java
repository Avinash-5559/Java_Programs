package J01_Java_Basic_Programs.Number_Pattern;

public class NumPat8 {
    public static void main(String[] args) {

        int row = 10;
        int str = 5;
        int num = 5;
        int temp = num;

        System.out.println();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= str; j++) {
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
            if (i < row / 2) {
                str--;
                temp--;
                num = temp;
            } else if (i > row / 2) {
                str++;
                temp++;
                num = temp;
            } else {
                num = temp;
            }
        }
    }
}

/*
    5 4 3 2 1
    4 3 2 1
    3 2 1
    2 1
    1
    1
    2 1
    3 2 1
    4 3 2 1
    5 4 3 2 1
*/