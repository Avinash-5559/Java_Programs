package J01_Java_Basic_Programs;

public class CharPat11 {
    public static void main(String[] args) {

        int row = 6;
        int str = 6;

        System.out.println();

        for (int i = 0; i < row; i++) {
            char c = 'F';
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
    F E D C B A
    F E D C B
    F E D C
    F E D
    F E
    F
*/