package J15_Exceptions;

public class EC13_Finally_Not_Executed {
    public static void main(String[] args) {

        try {
            int a = 10 / 10;
            System.out.println(a);
        }

// This can only stop the execution of the finally block means finally block value is not print during the RunTime

        // System.exit(0);

        catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("End of the Program");
        }
    }
}