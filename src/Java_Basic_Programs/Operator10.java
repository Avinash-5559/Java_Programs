package Java_Basic_Programs;

public class Operator10 {
    public static void main(String[] args) {
        int a=10;
        a<<=1;
        int b = a>20?a++:++a;
        System.out.println(a);//21
        System.out.println(b);//21
    }
}
