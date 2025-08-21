package J14_Wrapper_Class;

public class WC01_Program {
    public static void main(String[] args) {

        /*
        Boxing in Java means converting a primitive data type (like int, char, double, etc.)
        into its corresponding wrapper class object (like Integer, Character, Double, etc.)
        */

        int a1 = 10;
        Integer b1 = a1;                            // It is 'Boxing' in the Java done by JVM called 'Autoboxing'
        System.out.println(Integer.MAX_VALUE);      // Due to Autoboxing 'a1' having Attributes (Variables) of Integer Class
        System.out.println(Integer.MIN_VALUE);
        System.out.println(b1.intValue());          // Due to Autoboxing 'a1' having Behaviours (Methods) of Integer Class
        System.out.println(b1.floatValue());

        /*
        Unboxing in Java means converting wrapper class object (like Integer, Character, Double, etc.)
        into its native primitive data type (like int, char, double, etc.)
        */

        Integer a2 = 20;
        int b2 = a2;                                // It is Unboxing in the Java
        System.out.println(b2);

    }
}

class WrapperClassObject {
    Byte b;
    Short s;
    Integer i;
    Long l;
    Float f;
    Double d;
    Character c;
    Boolean bol;
}