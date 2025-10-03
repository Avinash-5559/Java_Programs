package J01_Java_Basic_Programs.Character_Pattern;

public class CharPat36 {
    public static void main(String[] args) {

        int row = 9;
        int str = 7;
        char c = 'H';

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                if (j == 0 || j == str - 1 || i == row / 2) {
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
    H           H
    H           H
    H           H
    H           H
    H H H H H H H
    H           H
    H           H
    H           H
    H           H
*/