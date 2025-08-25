package J01_Java_Basic_Programs;

public class CharPat32 {
    public static void main(String[] args) {

        int row = 5;
        int str = 5;
        char c = 'A';
        char temp = c;

        for (int i = 0; i < 2 * row - 1; i++) {
            for (int j = 0; j < 2 * str - 1; j++) {
                if (j == i || j == 2 * str - 2 - i) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
                c++;
            }
            System.out.println();
            c = temp;
        }
    }
}

/*
    A       I
     B     H
      C   G
       D F
        E
       D F
      C   G
     B     H
    A       I
*/