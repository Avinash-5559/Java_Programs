package J01_Java_Basic_Programs.Number_Pattern;

public class NumPat30 {
    public static void main(String[] args) {

        int row = 9;
        int spc = 9;
        int str = 1;
        int num = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < str; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
            spc--;
            str++;
            num++;
        }
    }
}

/*
            1
           2 2
          3 3 3
         4 4 4 4
        5 5 5 5 5
       6 6 6 6 6 6
      7 7 7 7 7 7 7
     8 8 8 8 8 8 8 8
    9 9 9 9 9 9 9 9 9
*/