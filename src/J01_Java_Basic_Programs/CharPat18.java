package J01_Java_Basic_Programs;

public class CharPat18 {
    public static void main(String[] args) {

        int row = 6;
        int str = 1;

        System.out.println();

        for (int i = 0; i < row; i++) {
            char c = 'A';
            for (int j = 0; j < str; j++) {
                System.out.print(c + " ");
                c++;
            }
            c -= 2;
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(c + " ");
                c--;
            }
            System.out.println();
            str++;
        }
    }
}

/*
    A
    A B A
    A B C B A
    A B C D C B A
    A B C D E D C B A
    A B C D E F E D C B A
*/