package Java_Basic_Programs;

public class CharPat29 {
    public static void main(String[] args) {

        int row = 5;
        int str = 9;

        System.out.println();

        for (int i = 0; i < row; i++) {
            char c = 'A';
            for (int j = 0; j < str; j++) {
                if (j < str / 2) {
                    System.out.print(c);
                    c++;
                } else if (j >= str / 2) {
                    System.out.print(c);
                    c--;
                }
            }
            System.out.println();
            str -= 2;
        }
    }
}

/*
    ABCDEDCBA
    ABCDCBA
    ABCBA
    ABA
    A
*/