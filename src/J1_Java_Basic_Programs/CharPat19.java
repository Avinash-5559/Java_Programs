package J1_Java_Basic_Programs;

public class CharPat19 {
    public static void main(String[] args) {

        int row = 6;
        int str = 1;
        int spc = 6;
        char c = 'A';

        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < str; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
            str++;
            spc--;
        }
    }
}

/*
         A
        A A
       A A A
      A A A A
     A A A A A
    A A A A A A
*/