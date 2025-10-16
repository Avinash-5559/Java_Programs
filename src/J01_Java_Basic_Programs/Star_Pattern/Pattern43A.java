package J01_Java_Basic_Programs.Star_Pattern;

public class Pattern43A {
    public static void main(String[] args) {

        int row = 6;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < Math.pow(2, i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
    *
    * *
    * * * *
    * * * * * * * *
    * * * * * * * * * * * * * * * *
    * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
*/