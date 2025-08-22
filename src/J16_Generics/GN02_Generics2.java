package J16_Generics;

public class GN02_Generics2 {
    public static void main(String[] args) {

        temp(23, 45);
        temp("Avinash", "Sinha");
        temp(true, false);
        temp("Avinash", 123);

    }

    // ------------------------------ T -> CAN BE ANY DATA TYPE ------------------------------

    public static <T> T temp(T a, T b) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}