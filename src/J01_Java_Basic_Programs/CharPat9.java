package J01_Java_Basic_Programs;

public class CharPat9 {
    public static void main(String[] args) {

        int row = 12;
        int str = 6;
        char c = 'F';
        char temp = c;

        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print(c + " ");
                c--;
            }
            System.out.println();
            if (i == (row / 2) - 1) {
                c = 'A';
            } else if (i < row / 2) {
                str--;
                temp--;
                c = temp;
            } else {
                str++;
                temp++;
                c = temp;
            }
        }

    }
}

/*
    F E D C B A
    E D C B A
    D C B A
    C B A
    B A
    A
    A
    B A
    C B A
    D C B A
    E D C B A
    F E D C B A
*/