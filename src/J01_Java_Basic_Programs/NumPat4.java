package J01_Java_Basic_Programs;

public class NumPat4 {
    public static void main(String[] args) {

        int row = 5;
        int str = 1;
        int num = 1;

        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
            str++;
            num++;
        }
    }
}

/*
    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5
*/