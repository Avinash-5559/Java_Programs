package J01_Java_Basic_Programs.Number_Pattern;

public class NumPat6 {
    public static void main(String[] args) {

        int row = 5;
        int str = 5;

        System.out.println();

        for (int i = 0; i < row; i++) {
            int num = 5;
            for (int j = 0; j < str; j++) {
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
            str--;
        }
    }
}

/*
    5 4 3 2 1
    5 4 3 2
    5 4 3
    5 4
    5
*/