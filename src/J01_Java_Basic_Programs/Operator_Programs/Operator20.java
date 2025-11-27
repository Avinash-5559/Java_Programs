package J01_Java_Basic_Programs.Operator_Programs;

public class Operator20 {
    public static void main(String[] args) {
        int a = 10;
        a >>= 1;
        int b = a++ > 5 ? a++ : ++a;
        System.out.println(b);//7
        System.out.println(a);//7
    }
}