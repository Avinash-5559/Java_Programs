package J1_Java_Basic_Programs;

public class CharPat6 {
    public static void main(String[] args) {

        int row = 6;
        int str = 1;
        char c = 'A';

        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
            str++;
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