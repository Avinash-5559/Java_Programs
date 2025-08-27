package J01_Java_Basic_Programs.Character_Pattern;

public class CharPat33 {
    public static void main(String[] args) {

        int row = 9;
        int spc = 5;
        int str = 1;
        char c = 'A';
        char temp = c;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < spc; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < str; j++) {
                if (j == 0 || j == i || i == (row - 1) || j == (str - 1)) {
                    System.out.print(c + " ");
                } else {
                    System.out.print("  ");
                }
                c += 2;
            }
            System.out.println();
            if (i < row / 2) {
                str++;
                spc--;
                c = temp;
            } else {
                str--;
                spc++;
                c = temp;
            }
        }
    }
}

/*
         A
        A C
       A   E
      A     G
     A       I
      A     G
       A   E
        A C
         A
*/