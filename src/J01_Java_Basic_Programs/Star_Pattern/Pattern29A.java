package J01_Java_Basic_Programs.Star_Pattern;

public class Pattern29A {
    public static void main(String[] args) {

        int row = 9;
        int str = 6;

        for (int i = 0; i <= row + 1; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print("* ");
            }
            System.out.println();
            if (i <= row / 2) {
                str--;
            } else {
                str++;
            }
        }
    }
}

/*
    * * * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
    * *
    * * *
    * * * *
    * * * * *
    * * * * * *
*/