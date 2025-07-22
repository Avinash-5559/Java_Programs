package Java_Basic_Programs;

public class CharPat26 {
    public static void main(String[] args) {

        int row = 6;
        int str = 1;
        int spc = 6;
        char c = 'F';
        char temp = c;

        System.out.println();

        for (int i = 0; i < row; i++) {
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
            temp--;
            c = temp;
        }
    }
}

/*
         F
        E F
       D E F
      C D E F
     B C D E F
    A B C D E F
*/