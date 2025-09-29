package J01_Java_Basic_Programs.Character_Pattern;

public class CharPat34 {
    public static void main(String[] args) {

        int row = 10;
        int spc = 10;
        int str = 1;
        char c = 'A';

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < str; j++) {
                if (j == 0 || j == i || i == (row / 2)) {
                    System.out.print(c + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            spc--;
            str++;
        }
    }
}

/*
             A
            A A
           A   A
          A     A
         A       A
        A A A A A A
       A           A
      A             A
     A               A
    A                 A
*/