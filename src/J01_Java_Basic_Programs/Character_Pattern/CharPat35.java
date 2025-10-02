package J01_Java_Basic_Programs.Character_Pattern;

public class CharPat35 {
    public static void main(String[] args) {

        int row = 9;
        int str = 7;
        char c = 'E';

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                if (i == 0 || j == 0 || i == row - 1) {
                    System.out.print(c + " ");
                } else if ((i == row / 2) && j == 1) {
                    for (int k = 0; k < str / 2; k++) {
                        System.out.print(c + " ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*
    E E E E E E E
    E
    E
    E
    E E E E
    E
    E
    E
    E E E E E E E
*/