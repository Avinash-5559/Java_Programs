package J15_Exceptions;

                    // Mostly prefer "try / catch / finally" instead of "throws"

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class EC10_Checked_Throws {
    public static void main(String[] args) throws Exception {
        // public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("C:log.txt");
    }
}