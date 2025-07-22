package Java_Basic_Programs;

public class Array_LowestValue_F_S {
    public static void main(String[] args) {

        int[] numb = {44, 23, 58, 88, 69, 96, 45, 76, 83, 99};
        int min = numb[0];
        int sec = 0;

        for (int i = 0; i < numb.length; i++) {
            if (numb[i] < min) {
                sec = min;
                min = numb[i];
            } else if ((numb[i] < sec) && (numb[i] != min)) {
                sec = numb[i];
            }
        }

        System.out.println("\nFirst Lowest Value is : " + min);

        System.out.println("\nSecond Lowest Value is : " + sec);

    }
}