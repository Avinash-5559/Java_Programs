package J01_Java_Basic_Programs.String_Programs;

public class StringManipulation_2 {
    public static void main(String[] args) {

        String input = "ddmmmm";

        StringBuilder result = new StringBuilder();

        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                result.append(input.charAt(i - 1));
                result.append(count);
                count = 1;
            }
        }

        result.append(input.charAt(input.length() - 1));
        result.append(count);
        System.out.println("\nOutput : " + result);

    }
}

/*

    ------------------------------ OUTPUT ------------------------------

    Output : d2m4

*/