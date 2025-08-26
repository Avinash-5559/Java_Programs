package J01_Java_Basic_Programs.Character_Pattern;

public class CharPat14 {
    public static void main(String[] args) {

        int row = 6;
        int str = 1;
        char c = 'A';

        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
            str++;
        }
    }
}

/*
    A
    B C
    D E F
    G H I J
    K L M N O
    P Q R S T U
*/