package Java_Basic_Programs;

public class Operator11 {
    public static void main(String[] args) {
        int i=0;
        i++;
        --i;
        int j=i++ + --i + ++i + i--;
        System.out.println(++j);//3
        System.out.println(i--);//0
    }
}
