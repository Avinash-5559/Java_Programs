package J01_Java_Basic_Programs;

public class CharPat31 {
    public static void main(String[] args) {

        int row = 5;
        int str = 5;
        char c = 'A';

        for (int i = 0; i < 2 * row - 1; i++) {
            for (int j = 0; j < 2 * str - 1; j++) {
                if (j == i || j == 2 * str - 2 - i) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            c++;
        }
    }
}

/*
    A       A
     B     B
      C   C
       D D
        E
       F F
      G   G
     H     H
    I       I
*/