package J01_Java_Basic_Programs;

public class NumPat22 {
    public static void main(String[] args) {

        int row = 5;
        int str = 5;
        int num = 1;
        int temp = num;

        for (int i = 0; i < 2 * row - 1; i++) {
            for (int j = 0; j < 2 * str - 1; j++) {
                if (j == i || j == 2 * str - 2 - i) {
                    System.out.print(num);
                } else {
                    System.out.print(" ");
                }
                num++;
            }
            System.out.println();
            num = temp;
        }
    }
}

/*
    1       9
     2     8
      3   7
       4 6
        5
       4 6
      3   7
     2     8
    1       9
*/