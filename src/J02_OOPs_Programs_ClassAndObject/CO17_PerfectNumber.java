package J02_OOPs_Programs_ClassAndObject;

public class CO17_PerfectNumber {

    int num;

    void findPerfectNumber() {
        int temp = num;
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (temp == sum) {
            System.out.println("\n" + temp + ": is a Perfect Number.");
        } else {
            System.out.println("\n" + temp + ": is not a Perfect Number.");
        }
    }
}