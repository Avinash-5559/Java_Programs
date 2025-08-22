package J15_Exceptions;

public class EC08_HandleException_TryCatchFinally1 {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        try {
            b = 10 / a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will be always executed");
        }
        System.out.println(b);
    }
}