package J01_Java_Basic_Programs;

public class PrintF {
    public static void main(String [] args) {
        int num=9;

/*
        %s - For String
        %d - For Integer (DATA TYPES USED : byte, short, int, long)
        %f - For Floating Point Numbers (DATA TYPES USED : float, double)
        %.<number>f - For Floating Point numbers with a specific number of decimal places
        %c - For Character (DATA TYPE USED : char)
        %b - For Boolean (DATA TYPE USED : boolean)
        %n - For new line
        %% - For Print a percent sign
*/

        System.out.println();
        System.out.printf("%d x 1 = %d %n",num, num * 1);
        System.out.printf("%d x 2 = %d %n",num, num * 2);
        System.out.printf("%d x 3 = %d %n",num, num * 3);
        System.out.printf("%d x 4 = %d %n",num, num * 4);
        System.out.printf("%d x 5 = %d %n",num, num * 5);
        System.out.printf("%d x 6 = %d %n",num, num * 6);
        System.out.printf("%d x 7 = %d %n",num, num * 7);
        System.out.printf("%d x 8 = %d %n",num, num * 8);
        System.out.printf("%d x 9 = %d %n",num, num * 9);
        System.out.printf("%d x 10 = %d %n",num, num * 10);
    }
}
