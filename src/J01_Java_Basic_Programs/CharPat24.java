package J01_Java_Basic_Programs;

public class CharPat24 {
    public static void main(String[] args) {

        int row = 12;
        int str = 6;
        int spc = 0;
        char c = 'A';
        char temp = c;

        System.out.println();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= spc; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= str; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
            if (i < row / 2) {
                str--;
                spc++;
                temp++;
            } else if (i > row / 2) {
                str++;
                spc--;
                temp--;
            }
            c = temp;
        }
    }
}

/*
    A B C D E F
      B C D E F
        C D E F
          D E F
            E F
              F
              F
            E F
          D E F
        C D E F
      B C D E F
    A B C D E F
*/