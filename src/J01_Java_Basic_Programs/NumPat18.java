package J01_Java_Basic_Programs;

public class NumPat18 {
    public static void main(String[] args) {

        int row = 5;
        int str = 1;
        int spc = 4;

        System.out.println();

        for (int i = 1; i <= row; i++) {
            int num = 1;
            for (int j = 1; j <= spc; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= str; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / j;
            }
            System.out.println();
            str++;
            spc--;
        }
    }
}

/*
        1
       1 1
      1 2 1
     1 3 3 1
    1 4 6 4 1
*/