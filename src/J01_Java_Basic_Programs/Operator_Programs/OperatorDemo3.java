package J01_Java_Basic_Programs.Operator_Programs;

public class OperatorDemo3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a=" + a + ", b=" + b);//a=10, b=5
    }
}