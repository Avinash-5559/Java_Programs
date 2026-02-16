package J01_Java_Basic_Programs.String_Programs;

/*
    A phrase is a  palindrome if, after converting all uppercase letters into lowercase letters
    and removing all non-alphanumeric characters,it reads the same forward and backward.
    Alphanumeric characters include letters and numbers.
*/

public class ValidPalindrome_2 {
    public static void main(String[] args) {

        String input = "race a car";
        System.out.println(isPalindrome(input));
    }

    //=========================================== TWO POINTER APPROACH ===========================================

    private static boolean isPalindrome(String input) {

        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(charArray[left])) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(charArray[right])) {
                right--;
            }

            if (Character.toLowerCase(charArray[left]) != Character.toLowerCase(charArray[right])) {
                return false;
            }

            left++;
            right--;

        }

        return true;
    }

}