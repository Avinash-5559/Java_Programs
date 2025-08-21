package J01_Java_Basic_Programs;

public class NumPat12 {
    public static void main(String[] args) {

        int row = 5;
        int str = 1;
        int num = 1;
        int temp = num;

        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
            str++;
            temp++;
            num = temp;
        }
    }
}

/*
    1
    2 1
    3 2 1
    4 3 2 1
    5 4 3 2 1
*/