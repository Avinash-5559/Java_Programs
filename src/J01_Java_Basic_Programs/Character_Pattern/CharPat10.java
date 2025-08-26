package J01_Java_Basic_Programs.Character_Pattern;

public class CharPat10 {
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
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
            str++;
            spc--;
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
*/