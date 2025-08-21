package J01_Java_Basic_Programs;

public class Array_HighestValue_F_S {
    public static void main(String[] args) {

        int[] numb = {44, 23, 58, 88, 69, 96, 45, 76, 83, 99};
        int max = numb[0];
        int sec = 0;

        for (int i = 0; i < numb.length; i++) {
            if (numb[i] > max) {
                sec = max;
                max = numb[i];
            } else if ((numb[i] > sec) && (numb[i] != max)) {
                sec = numb[i];
            }
        }

        System.out.println("\nFirst Highest Value is : " + max);

        System.out.println("\nSecond Highest Value is : " + sec);
    }
}