package J01_Java_Basic_Programs.Character_Pattern;

public class CharPat28 {
    public static void main(String[] args) {

        int row = 5;
        int str = 5;
        char c = 'A';
        char temp = c;

        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
            temp++;
            c = temp;
        }
    }
}

/*
    ABCDE
    BCDEF
    CDEFG
    DEFGH
    EFGHI
*/