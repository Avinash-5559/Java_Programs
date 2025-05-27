package Java_Basic_Programs;

public class Operator3 {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        int c=a++ + ++b;
        int d=b++ + ++a + c++;
        System.out.println(d);//44
        System.out.println(c);//22
        System.out.println(b);//12
        System.out.println(a);//12
    }
}
