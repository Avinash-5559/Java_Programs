package J2_OOPs_Programs_ClassAndObject;

public class CO16_StrongNumber {

    int num;

    void findStrongNumber() {

        int temp = num;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            sum += fact;
            num /= 10;
        }
        if (temp == sum) {
            System.out.println("\n" + temp + " : is a Strong Number.");
        } else {
            System.out.println("\n" + temp + " : is not a Strong Number.");
        }
    }
}