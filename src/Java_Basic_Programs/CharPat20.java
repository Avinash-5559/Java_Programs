package Java_Basic_Programs;

public class CharPat20 {
    public static void main(String[] args) {

        int row = 6;
        int str = 11;
        char c = 'A';
        char temp = c;

        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                if (j < str / 2) {
                    System.out.print(c + " ");
                    c++;
                } else {
                    System.out.print(c + " ");
                    c--;
                }
            }
            System.out.println();
            str -= 2;
            temp++;
            c = temp;
        }
    }
}

/*
    A B C D E F E D C B A
    B C D E F E D C B
    C D E F E D C
    D E F E D
    E F E
    F
*/