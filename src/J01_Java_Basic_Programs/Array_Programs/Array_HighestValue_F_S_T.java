package J01_Java_Basic_Programs.Array_Programs;

public class Array_HighestValue_F_S_T {
    public static void main(String[] args) {

        int[] numb = {44, 23, 58, 88, 69, 96, 45, 76, 83, 99};

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i = 0; i < numb.length; i++) {
            if (numb[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = numb[i];
            } else if ((numb[i] > secondMax) && (numb[i] != firstMax)) {
                thirdMax = secondMax;
                secondMax = numb[i];
            } else if ((numb[i] > thirdMax) && (numb[i] != firstMax)) {
                thirdMax = numb[i];
            }
        }

        System.out.println("\nFirst Highest Value is : " + firstMax);

        System.out.println("\nSecond Highest Value is : " + secondMax);

        System.out.println("\nThird Highest Value is : " + thirdMax);

    }
}