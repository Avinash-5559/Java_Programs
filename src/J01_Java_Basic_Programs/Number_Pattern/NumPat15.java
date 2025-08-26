package J01_Java_Basic_Programs.Number_Pattern;

public class NumPat15 {
    public static void main(String[] args) {

        int row = 5;
        int str = 1;
        int spc = 4;

        System.out.println();

        for (int i = 0; i < row; i++) {
            int num = 1;
            for (int j = 0; j < spc; j++) {
                System.out.print(" ");
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
       1 2
      1 2 3
     1 2 3 4
    1 2 3 4 5
*/