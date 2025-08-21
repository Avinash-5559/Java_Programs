package J1_Java_Basic_Programs;

public class CharPat8 {
    public static void main(String[] args) {

        int row = 12;
        int str = 6;

        System.out.println();

        for (int i = 0; i < row; i++) {
            char c = 'A';
            for (int j = 0; j < str; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
            if (i == (row / 2) - 1) {
                str = 1;
            } else if (i < row / 2) {
                str--;
            } else {
                str++;
            }
        }
    }
}

/*
    A B C D E F
    A B C D E
    A B C D
    A B C
    A B
    A
    A
    A B
    A B C
    A B C D
    A B C D E
    A B C D E F
*/