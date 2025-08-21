package J10_TypeCasting;

/*
---------------------------------------- DATA TYPE CASTING ----------------------------------------

1) Widening Type Casting :
    - Casting lower size of data type to any other higher size of data type is known as Widening Type Casting.
    - When there is data added that casting is called Widening Type Casting.
    - It can be Implicit or Explicit both the way.

2) Narrowing Type Casting :
    - Casting higher size of data type to any other lower size of data type is known as Narrowing Type Casting.
    - When there is data lose that casting is called Narrowing Type Casting.
    - It can be Explicit only.
*/

public class DataTypeCasting {
    public static void main(String[] args) {

        int i1 = 10;
        float w1 = i1;                          // Widening Type Casting - Implicit Way
        System.out.println(w1);

        long l1 = 11111111111L;
        double w2 = l1;                         // Widening Type Casting - Implicit Way
        System.out.println(w2);

        char c1 = 'A';
        int w3 = c1;                            // Widening Type Casting - Implicit Way
        System.out.println(w3);

        char c2 = 'A';
        int w4 = (int) c2;                      // Widening Type Casting - Explicit Way
        System.out.println(w4);

        short s1 = 256;
        float w5 = (float) s1;                  // Widening Type Casting - Explicit Way
        System.out.println(w5);

        float f1 = 45.656F;
        int n1 = (int) f1;                      // Narrowing Type Casting - Explicit Way Only
        System.out.println(n1);

        double d1 = 125.11376645;
        long n2 = (long) d1;                    // Narrowing Type Casting - Explicit Way Only
        System.out.println(n2);

        char c3 = 'A';
        short n3 = (short) c3;                  // Narrowing Type Casting - Explicit Way Only
        System.out.println(n3);

        short s2 = 126;
        char n4 = (char) s2;                    // Narrowing Type Casting - Explicit Way Only
        System.out.println(n4);

        int i2 = 97;
        char n5 = (char) i2;                    // Narrowing Type Casting - Explicit Way Only
        System.out.println(n5);

    }
}