package J16_Generics;

    /*
      Instead of this type of program where different data type used make them one. Show the GN02_Generic2 Program
    */

public class GN01_Generics1 {
    public static void main(String[] args) {

        Integer i = temp_sum(45, 23);
        System.out.println(i);

        String s = temp_sum("Avinash", "Sinha");
        System.out.println(s);

    }

    static Integer temp_sum(Integer a, Integer b) {
        return a + b;
    }

    static String temp_sum(String a, String b) {
        return a + b;
    }
}