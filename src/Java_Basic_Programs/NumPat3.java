package Java_Basic_Programs;

public class NumPat3 {
    public static void main(String[] args) {

        int row = 5;
        int str = 1;

        System.out.println();

        for (int i = 0; i < row; i++) {
            int num = 1;
            for (int j = 0; j < str; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            str++;
        }
    }
}

/*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
*/