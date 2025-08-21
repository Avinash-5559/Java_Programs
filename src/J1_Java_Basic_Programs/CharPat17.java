package J1_Java_Basic_Programs;

public class CharPat17 {
    public static void main(String[] args) {

        int row = 6;
        int str = 1;
        int spc = 6;
        char temp = 'A';

        System.out.println();

        for (int i = 0; i < row; i++) {
            char c = 'A';
            for (int j = 0; j < spc; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < str; j++) {
                if (j == 0 || j == i) {
                    System.out.print(c + " ");
                } else if (j == 1) {
                    temp++;
                    System.out.print(temp + " ");
                } else {
                    System.out.print(temp + " ");
                }
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
       A B A
      A C C A
     A D D D A
    A E E E E A
*/