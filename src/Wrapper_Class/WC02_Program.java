package Wrapper_Class;

public class WC02_Program {
    public static void main(String[] args) {

        String num1 = "10";

        //------------------------------ String convert into Wrapper Class Object ------------------------------

        Integer a1 = Integer.parseInt(num1);
        System.out.println("a1 : " + a1);

        Integer a2 = Integer.valueOf(num1);
        System.out.println("a2 : " + a2);

        //------------------------------ String convert into Primitive Data Types ------------------------------

        int a3 = Integer.parseInt(num1);
        System.out.println("a3 : " + a3);

        //------------------------------ Wrapper Class Object convert into String ------------------------------

        Integer num2 = 20;

        String a4 = Integer.toString(num2);
        System.out.println("a4 : " + a4);

    }
}