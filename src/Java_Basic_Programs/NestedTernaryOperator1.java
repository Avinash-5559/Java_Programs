package Java_Basic_Programs;

public class NestedTernaryOperator1 {
    public static void main(String [] args) {
        int x=100, y=90, z=70;
        int largest = x>=y ? ( (x>=z) ? x : z ):( (y>=z) ? y : z );
        System.out.println("Largest Number : "+largest);
    }
}
