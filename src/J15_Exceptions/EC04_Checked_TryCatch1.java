package J15_Exceptions;

public class EC04_Checked_TryCatch1 {
    public static void main(String[] args) {

        System.out.println("1");

        try {

            int a = 10 / 0;

        } catch (Exception e) {

            // It shows the full problem in details with line number

            e.printStackTrace();

            // It shows only the  message i.e. this - / by zero

            System.out.println(e.getMessage());

            // User's own Message

            System.out.println("Are you fool ? Divide by zero is not possible in JAVA!");

        }

        System.out.println("2");
    }
}