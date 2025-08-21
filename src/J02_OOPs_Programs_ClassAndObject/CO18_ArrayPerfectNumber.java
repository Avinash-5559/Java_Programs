package J02_OOPs_Programs_ClassAndObject;

public class CO18_ArrayPerfectNumber {

    void printPerfect(int[] nums) {

        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;

            for (int j = 1; j <= nums[i] / 2; j++) {
                if (nums[i] % j == 0) {
                    sum += j;
                }
            }
            if (sum == nums[i]) {
                System.out.print("\n" + nums[i] + " : is a Perfect Number.");
            }
        }
        System.out.println();
    }
}