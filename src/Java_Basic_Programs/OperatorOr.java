package Java_Basic_Programs;

public class OperatorOr {
    public static void main(String [] args) {
        byte i=85;
        boolean j=((i<=80)|(i++<=100));
        System.out.println(j);//true
        System.out.println(i);//86
        byte a=90;
        boolean b=((a>=80)||(a++>=100));
        System.out.println(b);//true
        System.out.println(a);//90
    }
}
