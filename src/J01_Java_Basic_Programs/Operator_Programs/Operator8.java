package J01_Java_Basic_Programs.Operator_Programs;

public class Operator8 {
    public static void main(String[] args) {
        int i = 5;
        int j = ++i > 5 ? i++ : ++i;
        System.out.println(j);//6
        System.out.println(i);//7
    }
}