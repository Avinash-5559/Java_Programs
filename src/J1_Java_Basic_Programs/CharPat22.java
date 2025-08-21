package J1_Java_Basic_Programs;

public class CharPat22 {
    public static void main(String[] args) {

        int row = 11;
        int str = 1;
        int spc = 5;

        System.out.println();

        for (int i = 0; i < row; i++) {
            char c = 'A';
            for (int j = 0; j < spc; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < str; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
            if (i < row / 2) {
                str++;
                spc--;
            } else {
                str--;
                spc++;
            }
        }
    }
}

/*
         A
        A B
       A B C
      A B C D
     A B C D E
    A B C D E F
     A B C D E
      A B C D
       A B C
        A B
         A
*/