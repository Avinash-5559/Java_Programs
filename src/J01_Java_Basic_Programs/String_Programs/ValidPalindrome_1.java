package J01_Java_Basic_Programs.String_Programs;

/*
    A phrase is a  palindrome if, after converting all uppercase letters into lowercase letters
    and removing all non-alphanumeric characters,it reads the same forward and backward.
    Alphanumeric characters include letters and numbers.
*/

public class ValidPalindrome_1 {
    public static void main(String[] args) {

        String input = "A man, a plan, a canal: Panama";

        StringBuilder sb = new StringBuilder();

        char[] charArray = input.toCharArray();

        for (char ch : charArray) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        String cleanedInput = sb.toString();
        String reversedInput = sb.reverse().toString();

        if (cleanedInput.equals(reversedInput)) {
            System.out.println("\nIt is a Valid Palindrome");
        } else {
            System.out.println("\nIt is not a Valid Palindrome");
        }

    }
}