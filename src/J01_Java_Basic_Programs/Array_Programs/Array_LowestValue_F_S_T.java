package J01_Java_Basic_Programs.Array_Programs;

public class Array_LowestValue_F_S_T {
    public static void main(String[] args) {

        int[] numb = {44, 23, 58, 88, 69, 96, 45, 76, 83, 99};

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int thirdMin = Integer.MAX_VALUE;

        for (int i = 0; i < numb.length; i++) {
            if (numb[i] < firstMin) {
                thirdMin = secondMin;
                secondMin = firstMin;
                firstMin = numb[i];
            } else if ((numb[i] < secondMin) && (numb[i] != firstMin)) {
                thirdMin = secondMin;
                secondMin = numb[i];
            } else if ((numb[i] < thirdMin) && (numb[i] != firstMin)) {
                thirdMin = numb[i];
            }
        }

        System.out.println("\nFirst Lowest Value is : " + firstMin);

        System.out.println("\nSecond Lowest Value is : " + secondMin);

        System.out.println("\nThird Lowest Value is : " + thirdMin);

    }
}