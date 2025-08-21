package J01_Java_Basic_Programs;

public class PrimeNumbers1to100ForLoop_1 {
    public static void main(String[] args) {

        for (int n = 1; n <= 100; n++) {

            boolean prime = true;

            if (n >= 2) {

                for (int i = 2; i <= n / 2; i++) {
                    if (n % i == 0) {
                        prime = false;
                        break;
                    }
                }

                    if (prime) {
                        System.out.print(n+ " ");
                }
            }
        }
    }
}