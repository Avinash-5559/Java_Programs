package J15_Exceptions;

public class EC02_Unchecked {
    public static void main(String[] args) {

        // java.lang.ArithmeticException: / by zero - JVM doesn't know

        /*

        int a = 0;
        int b = 10;
        int c = b / a;
        System.out.println(c);

         */

        //  java.lang.NullPointerException: Cannot invoke "String.trim()" because "name" is null - JVM doesn't know

        String name = null;
        name.trim();

    }
}