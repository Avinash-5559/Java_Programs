package J16_Generics;

public class GN03_Generics3 {
    public static void main(String[] args) {

        System.out.println("\nMaximum Integer Value is  : " + findMax(34, 53, 86));

        System.out.println("\nMaximum Floating Value is : " + findMax(4.25, 5.66, 2.66));

        System.out.println("\nMaximum String Value is   : " + findMax("apple", "orange", "guava"));

    }

     static <T extends Comparable<T>> T findMax(T a, T b, T c) {

        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;

    }
}