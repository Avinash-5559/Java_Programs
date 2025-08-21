package J1_Java_Basic_Programs;

public class Operator9 {
    public static void main(String [] args) {
        int a=4;
        System.out.println((a&=5)>5 || (a--<5));//true
        System.out.println(a);//3
    }
}
