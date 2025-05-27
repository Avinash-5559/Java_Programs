package Java_Basic_Programs;

public class Operator14 {
    public static void main(String[] args) {
        int a = 5;
        a++;
        int b = --a > 5 ? 6 : a++;
        System.out.println(b);//5
        System.out.println(a);//6
    }
}
