package J02_OOPs_Programs_ClassAndObject;

public class CO15_Palindrome {

    int num;

    void findPalindrome() {

        int a = num;
        int temp = 0;

        while (num > 0) {
            int rem = num % 10;
            temp = temp * 10 + rem;
            num /= 10;
        }

        if (a == temp) {
            System.out.println("\n" + a + " : is a Palindrome Number.");
        } else {
            System.out.println("\n" + a + ": is not a Palindrome Number.");
        }
    }
}