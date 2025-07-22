package Java_Basic_Programs;

public class NumPat9 {
    public static void main(String[] args) {

        int row = 5;
        int str = 1;

        System.out.println();

        for (int i = 0; i < row; i++) {
            int num = 5;
            for (int j = 0; j < str; j++) {
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
            str++;
        }
    }
}

/*
    5
    5 4
    5 4 3
    5 4 3 2
    5 4 3 2 1
*/