package Java_Basic_Programs;

public class Operator4 {
    public static void main(String[] args) {
        int a=5;
        a++;
        int b = a>5?6:a++;
        System.out.println(a);//6
        System.out.println(b);//6
    }
}
