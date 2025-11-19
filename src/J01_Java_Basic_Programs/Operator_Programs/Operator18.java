package J01_Java_Basic_Programs.Operator_Programs;

public class Operator18 {
    public static void main(String[] args) {
        int i = 5;
        int j = i++ > 5 ? i++ : ++i;
        System.out.println(j);//7
        System.out.println(i);//7
    }
}