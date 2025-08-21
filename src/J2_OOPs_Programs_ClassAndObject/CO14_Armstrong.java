package J2_OOPs_Programs_ClassAndObject;

public class CO14_Armstrong {

    int num;

    void findArmstrong() {

        int a = num;
        int num1 = num;
        int count = 0;
        int temp = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        if (count == 3) {

            while (num1 > 0) {
                int rem = num1 % 10;
                int out = rem * rem * rem;
                temp += out;
                num1 /= 10;
            }

        } else {

            while (num1 > 0) {
                int rem = num1 % 10;
                int out = rem * rem * rem * rem;
                temp += out;
                num1 /= 10;
            }
        }
        if (a == temp) {
            System.out.println("\n" + a + " : is an Armstrong Number");
        } else {
            System.out.println("\n" + a + " : is not an Armstrong Number");
        }
    }
}