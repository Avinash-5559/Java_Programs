package Java_Basic_Programs;

public class CharPat12 {
    public static void main(String[] args) {

        int row = 6;
        int str = 1;

        System.out.println();

        for (int i = 0; i < row; i++) {
            char c = 'F';
            for (int j = 0; j < str; j++) {
                System.out.print(c + " ");
                c--;
            }
            System.out.println();
            str++;
        }
    }
}

/*
    F
    F E
    F E D
    F E D C
    F E D C B
    F E D C B A
*/