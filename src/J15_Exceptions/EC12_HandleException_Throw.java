package J15_Exceptions;

public class EC12_HandleException_Throw {

    static void validate_age(int age) {
        if (age < 18) {
            try {
                throw new Exception("Age can't be less than 18");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}