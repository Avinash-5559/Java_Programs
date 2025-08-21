package J1_Java_Basic_Programs;

public class CharPat15 {
    public static void main(String[] args) {

        int row = 6;
        int str = 1;
        char c = 'A';
        char temp = c;

        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print(c + " ");
                c--;
            }
            System.out.println();
            str++;
            temp++;
            c = temp;
        }
    }
}

/*
    A
    B A
    C B A
    D C B A
    E D C B A
    F E D C B A
*/