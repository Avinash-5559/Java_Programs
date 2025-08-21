package J1_Java_Basic_Programs;

public class Array_HighestValue {
    public static void main(String[] args) {

        int[] numb = {44, 23, 58, 88, 69, 96, 45, 76, 83, 99};
        int max = numb[0];

        for (int i = 0; i < numb.length; i++) {
            if (numb[i] > max) {
                max = numb[i];
            }
        }
        System.out.println("\nHighest Value is : " + max);
    }
}