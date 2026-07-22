/*
    Class:  A class is a blueprint or template used for creating objects.
            It defines the structure, including the variables (attributes) and methods (behaviors).
    Object: An object is the real-world entity which is created from that blueprint using the new keyword.
            It has actual values and can perform actions.
                                                      OR
            An object which are accesses and the uses of instance variables and methods
            which are defined by its class.
*/

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