package Java_Basic_Programs;

public class NumPat19 {
    public static void main(String[] args) {

        int row = 4;
        int str = 4;
        int num = 1;

        System.out.println();

        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < str; j++) {
                    System.out.print(num + " ");
                    num++;
                }
            } else {
                for (int j = 0; j < str; j++) {
                    System.out.print(num + " ");
                    num--;
                }
            }
            System.out.println();
            if (i % 2 == 0) {
                num += 3;
            } else {
                num += 5;
            }
        }
    }
}

/*
    1 2 3 4
    8 7 6 5
    9 10 11 12
    16 15 14 13
*/