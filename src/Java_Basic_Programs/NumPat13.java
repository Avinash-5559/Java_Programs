package Java_Basic_Programs;

public class NumPat13 {
    public static void main(String[] args) {

        int row = 5;
        int str = 1;
        int num = 1;
        int temp = num;

        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print(num + " ");
                num += 5;
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
    2 7
    3 8 13
    4 9 14 19
    5 10 15 20 25
*/