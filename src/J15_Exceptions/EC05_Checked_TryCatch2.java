package J15_Exceptions;

public class EC05_Checked_TryCatch2 {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        try {
            b = 10 / a;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);

    }
}