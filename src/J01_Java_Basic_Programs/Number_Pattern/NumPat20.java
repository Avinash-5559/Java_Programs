package J01_Java_Basic_Programs.Number_Pattern;

public class NumPat20 {
    public static void main(String[] args) {

        int row = 4;
        int str = 1;
        int num = 1;

        System.out.println();

        for (int i = 1; i <= row; i++) {
            if (i == 1) {
                for (int j = 1; j <= str; j++) {
                    System.out.print(num + " ");
                    num += 2;
                }
            } else if (i % 2 == 0) {
                for (int j = 1; j <= str; j++) {
                    System.out.print(num + " ");
                    num--;
                }
            } else {
                for (int j = 1; j <= str; j++) {
                    System.out.print(num + " ");
                    num++;
                }
            }
            System.out.println();
            str++;

            if (i > 1) {
                num += 3;
            }
        }
    }
}

/*
    1
    3 2
    4 5 6
    10 9 8 7
*/