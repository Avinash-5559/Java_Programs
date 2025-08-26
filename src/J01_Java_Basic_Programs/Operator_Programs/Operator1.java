package J01_Java_Basic_Programs.Operator_Programs;

public class Operator1 {
    public static void main(String [] args) {
        int i=0;
        i++;
        --i;
        int j=i++ + --i + ++i +i--;
        System.out.println(j);//2
        System.out.println(i);//0
    }
}
