package J01_Java_Basic_Programs;

public class NumPat2 {
    public static void main(String[] args) {

        int row = 3;
        int str = 1;
        int spc = 2;
        int num = 1;

        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < str; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            str++;
            spc--;
        }
    }
}

/*
        1
      2 3
    4 5 6
*/