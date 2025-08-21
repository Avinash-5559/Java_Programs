package J1_Java_Basic_Programs;

public class CharPat4 {
    public static void main(String[] args) {

        int row = 3;
        int str = 3;
        char c = 'F';

        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print(c + " ");
                c--;
            }
            System.out.println();
            str--;
        }
    }
}

/*
    F E D
    C B
    A
*/