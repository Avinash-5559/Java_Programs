package Java_Basic_Programs;

public class CharPat21 {
    public static void main(String[] args) {

        int row = 6;
        int str = 6;
        int spc = 0;

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
            str--;
            spc++;
        }
    }
}

/*
    A B C D E F
     A B C D E
      A B C D
       A B C
        A B
         A
*/