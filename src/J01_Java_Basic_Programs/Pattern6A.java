package J01_Java_Basic_Programs;

public class Pattern6A {
    public static void main(String[] args) {

        int row = 5;
        int str = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print("* ");
            }
            if (i < row / 2) {
                str++;
            } else {
                str--;
            }
            System.out.println();
        }
    }
}

/*
    *
    * *
    * * *
    * *
    *
*/