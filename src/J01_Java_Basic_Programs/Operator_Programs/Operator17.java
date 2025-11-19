package J01_Java_Basic_Programs.Operator_Programs;

public class Operator17 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(++a > 10 && b-- < 10);//false
        System.out.println(a);//11
        System.out.println(b);//9
    }
}