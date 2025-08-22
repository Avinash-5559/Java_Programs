package J15_Exceptions;

public class EC06_HandleException_TryCatch3 {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        try {
            b = 10 / a;
            String name = null;
            name.trim();
        }

        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        /*
        catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        */

        System.out.println(b);
    }
}