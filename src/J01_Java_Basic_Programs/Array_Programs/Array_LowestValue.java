package J01_Java_Basic_Programs.Array_Programs;

public class Array_LowestValue {
    public static void main(String[] args) {

        int[] numb = {44, 23, 58, 88, 14, 96, 15, 76, 83, 99};
        int min = numb[0];

        for (int i = 0; i < numb.length; i++) {
            if (numb[i] < min) {
                min = numb[i];
            }
        }
        System.out.println("\nLowest Values is : " + min);
    }
}