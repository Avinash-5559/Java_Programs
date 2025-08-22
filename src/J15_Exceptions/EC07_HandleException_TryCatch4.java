package J15_Exceptions;

public class EC07_HandleException_TryCatch4 {
    public static void main(String[] args) {

        try {
            String ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 100 / a;
            System.out.println("\nOutput is : " + b);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}