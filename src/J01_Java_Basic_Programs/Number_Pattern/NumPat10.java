package J01_Java_Basic_Programs.Number_Pattern;

public class NumPat10 {
    public static void main(String[] args) {

        int row = 5;
        int str = 5;

        System.out.println();

        for (int i = 0; i < row; i++) {
            int num = 1;
            for (int j = 0; j < str; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            str--;
        }
    }
}

/*
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
*/