package J15_Exceptions;

public class EC01_MainProgram {
    public static void main(String[] args) {

        System.out.println("\nStart the Program");
        String ip = args[0];                        // java.lang.ArrayIndexOutOfBoundsException when argument is "null"
        int a = Integer.parseInt(ip);               // java.lang.NumberFormatException when argument is "String value"
        int b = 100 / a;                            // java.lang.ArithmeticException when argument is "zero"
        System.out.println("\nOutput is : " + b);
        System.out.println("\nEnd the Program");

    }
}