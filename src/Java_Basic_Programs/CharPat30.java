package Java_Basic_Programs;

public class CharPat30 {
    public static void main(String[] args) {

        int row=6;
        int str=5;
        int str2=1;
        char c='A';

        System.out.println();

        for (int i = 0; i < row; i++) {
            char c2='A';
            for (int j = 0; j < str; j++) {
                System.out.print(c2+" ");
            }
            for (int j = 0; j < str2; j++) {
                System.out.print(c+" ");
            }
            System.out.println();
            str--;
            str2++;
            c++;
        }
    }
}

/*
    A A A A A A
    A A A A B B
    A A A C C C
    A A D D D D
    A E E E E E
    F F F F F F
*/