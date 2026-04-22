package J01_Java_Basic_Programs.String_Programs;

public class StringManipulation_1 {
    public static void main(String[] args) {

        String input = "r@56vi ku$mar67";

        StringBuilder stringBuilder = new StringBuilder();

        int sum = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch) || ch == ' ') {
                stringBuilder.append(ch);
            } else if (Character.isDigit(ch)) {
                sum = sum + Character.getNumericValue(ch);
            }
        }

        stringBuilder.append(" ");
        stringBuilder.append(sum);
        System.out.println("\nOutput : " + stringBuilder);

    }
}

/*

    ------------------------------ OUTPUT ------------------------------

    Output : rvi kumar 24

*/