package J01_Java_Basic_Programs;

public class CharPat1 {
    public static void main(String[] args) {

        int row = 3;
        int str = 3;
        char c = 'A';

        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
            c++;
        }
    }
}

/*
    A A A
    B B B
    C C C
*/