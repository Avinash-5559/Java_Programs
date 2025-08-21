package J01_Java_Basic_Programs;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0, b=1, c, d=10;

        System.out.print("\nFibonacci Series of First "+d+" Terms are : ");

        for (int i = 1; i <=d ; i++) {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println();
    }
}
