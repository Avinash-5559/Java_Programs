package Java_Basic_Programs;

public class NumPat14 {
    public static void main(String[] args) {

        int row = 5;
        int str = 1;


        System.out.println();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= str; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            str++;
        }
    }
}

/*
    1
    1 2 1
    1 2 3 2 1
    1 2 3 4 3 2 1
    1 2 3 4 5 4 3 2 1
*/