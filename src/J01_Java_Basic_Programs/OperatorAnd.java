package J01_Java_Basic_Programs;

public class OperatorAnd {
    public static void main(String [] args) {
        byte i=85;
        boolean j=((i<=80)&(i++<=100));
        System.out.println(j);//false
        System.out.println(i);//86
        byte a=90;
        boolean b=((a<=80)&&(a++<=100));
        System.out.println(b);//false
        System.out.println(a);//90
    }
}
