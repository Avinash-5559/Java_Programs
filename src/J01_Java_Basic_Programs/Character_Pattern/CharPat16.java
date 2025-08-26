package J01_Java_Basic_Programs.Character_Pattern;

public class CharPat16 {
    public static void main(String[] args) {

        int row = 6;
        int str = 1;
        char c = 'A';
        char temp = c;

        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print(c + " ");
                c += 5;
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
    B G
    C H M
    D I N S
    E J O T Y
    F K P U Z _
*/