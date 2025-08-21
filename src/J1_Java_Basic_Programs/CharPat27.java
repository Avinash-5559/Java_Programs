package J1_Java_Basic_Programs;

public class CharPat27 {
    public static void main(String[] args) {

        int row = 6;
        int str = 1;
        int spc = 6;

        System.out.println();

        for (int i = 0; i < row; i++) {
            char c = 'A';
            for (int j = 0; j < spc; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < str; j++) {
                System.out.print(c);
                c++;
            }
            c -= 2;
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(c);
                c--;
            }
            System.out.println();
            str++;
            spc--;
        }
    }
}

/*
         A
        ABA
       ABCBA
      ABCDCBA
     ABCDEDCBA
    ABCDEFEDCBA
*/