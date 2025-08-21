package J01_Java_Basic_Programs;

public class NumPat11 {
    public static void main(String[] args) {

        int row = 5;
        int str = 1;
        int num = 1;

        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            str++;
        }
    }
}

/*
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
*/