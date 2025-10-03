package J01_Java_Basic_Programs.Character_Pattern;

public class CharPat37 {
    public static void main(String[] args) {

        int row = 9;
        int str = 7;
        char c = 'I';

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                if (i == 0 || i == row - 1 || j == str / 2) {
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
    I I I I I I I
          I
          I
          I
          I
          I
          I
          I
    I I I I I I I
*/