package J01_Java_Basic_Programs.Operator_Programs;

public class Operator13 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        a = a++ + ++b;
        int d = b++ + ++a + c++;
        System.out.println(d);//43
        System.out.println(c);//11
        System.out.println(b);//12
        System.out.println(a);//22
    }
}