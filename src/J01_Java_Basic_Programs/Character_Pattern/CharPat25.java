package J01_Java_Basic_Programs.Character_Pattern;

public class CharPat25 {
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
            c++;
        }
    }
}

/*
         A
        B B
       C C C
      D D D D
     E E E E E
    F F F F F F
*/