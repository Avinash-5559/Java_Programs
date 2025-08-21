package J1_Java_Basic_Programs;

public class NumPat7 {
    public static void main(String[] args) {

        int row = 10;
        int str = 5;

        System.out.println();

        for (int i = 1; i <= row; i++) {
            int num = 1;
            for (int j = 1; j <= str; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            if (i < row / 2) {
                str--;
            } else if (i > row / 2) {
                str++;
            } else {
                str = 1;
            }
        }
    }
}

/*
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
*/