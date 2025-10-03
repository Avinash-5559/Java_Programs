package J01_Java_Basic_Programs.Character_Pattern;

public class CharPat38 {
    public static void main(String[] args) {

        int row = 9;
        int str = 9;
        char c = 'T';

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                if (i == 0 || j == str / 2) {
                    System.out.print(c + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/*
    T T T T T T T T T
            T
            T
            T
            T
            T
            T
            T
            T
*/